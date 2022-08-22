package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.entities.concretes.User;
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

    @Autowired
    private UserRepo userRepo;
    private UserMapper userMapper;

    @Override
    public UserModel add(UserModel userModel) {
        this.userRepo.save(userMapper.checkAndConvertToEntity(userModel));
        return  userModel;
    }

    @Override
    public UserModel deleteUser(String id) {
        return null;
    }


    @Override
    public List<UserModel> getAllUser() {
        List<User> userList = userRepo.findAll();
        List<UserModel> userModelList = new ArrayList<>();
        for(User user : userList){
            userModelList.add(userMapper.convertToDto(user));
        }
        return userModelList;
    }

    @Override
    public UserModel findByEmail(String email) {
        return null;
    }

}
