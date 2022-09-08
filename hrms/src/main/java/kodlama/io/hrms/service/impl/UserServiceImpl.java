package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.config.Security.JwtTokenProvider;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.entities.domain.User;
import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.exception.CustomException;
import kodlama.io.hrms.repo.UserRepo;
import kodlama.io.hrms.service.UserService;
import kodlama.io.hrms.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public UserServiceImpl(UserRepo userRepo, UserMapper userMapper, PasswordEncoder passwordEncoder, JwtTokenProvider jwtTokenProvider, AuthenticationManager authenticationManager) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
        this.authenticationManager = authenticationManager;
    }


    @Override
    public String addUser(UserModel userModel) {
        if (!userRepo.selectExistEmail(userModel.getEmail())){
            User user = userMapper.checkAndConvertToEntity(userModel);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepo.save(user);
            return jwtTokenProvider.createToken(user.getEmail(), user.getRoles());
        }

        throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @Override
    public String signIn(String email , String password) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
            return jwtTokenProvider.createToken(email, userRepo.findByEmail(email).getRoles());
        } catch (AuthenticationException e) {
            throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @Override
    public String refresh(String email) {
        return jwtTokenProvider.createToken(email,userRepo.findByEmail(email).getRoles());
    }


    @Override
    public DataResult<UserModel> deleteUser(String id) {
        return null;
    }


    @Override
    public List<UserModel> getAllUser() {
        List<User> userList = userRepo.findAll();
        List<UserModel> userModelList = new ArrayList<>();
        for (User user : userList) {
            userModelList.add(userMapper.convertToDto(user));
        }
        return userModelList;
    }

    @Override
    public DataResult<UserModel> findByEmail(String email) {
        User user = userRepo.findByEmail(email);
        if (!(user==null)){
            UserModel userModel = userMapper.convertToDto(user);
            return new SuccessDataResult<>(userModel,"Kullanıcı bulundu");
        }

        return new ErrorDataResult<>("Kullanıcı bulunamadı");
    }


}
