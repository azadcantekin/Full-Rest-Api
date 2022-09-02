package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.entities.domain.User;
import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.repo.UserRepo;
import kodlama.io.hrms.service.UserService;
import kodlama.io.hrms.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    private final UserRepo userRepo;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepo userRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;

    }


    @Override
    public DataResult<UserModel> addUser(UserModel userModel) {
        if (!userRepo.existsByUsername(userModel.getUsername())){
            User user = userMapper.checkAndConvertToEntity(userModel);
            userRepo.save(user);
            return new SuccessDataResult<>(userModel,"Kullanıcı kayıt edildi");
        }

        return new ErrorDataResult<>(userModel,"Kullanıcı kayıt edilirken bir sorun ile karşılaşıldı");
    }


    @Override
    public void addRoleToUser(String username, String name) {
        User user = userRepo.findByUsername(username);


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
    public DataResult<UserModel> findByUsername(String username) {
        User user = userRepo.findByUsername(username);
        if (!(user ==null)){
            UserModel userModel = userMapper.checkAndConvertToDto(user);
            return new SuccessDataResult<>(userModel,"Kullanıcı bulundu");
        }

        return new ErrorDataResult<>("Kullanıcı bulunamadı");
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
