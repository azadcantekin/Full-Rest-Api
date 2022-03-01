package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.entities.concretes.User;
import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.repo.UserDao;
import kodlama.io.hrms.service.abstracts.UserService;
import kodlama.io.hrms.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserServiceImpl(UserDao userDao, UserMapper userMapper) {
        this.userDao = userDao;
        this.userMapper = userMapper;
    }

    private UserDao userDao;
    private UserMapper userMapper;





    @Override
    public UserModel add(UserModel userModel) {
        this.userDao.save(userMapper.checkAndConvertToEntity(userModel));
        return  userModel;
    }

    @Override
    public UserModel findByEmail(String email) {
        return null;
    }
}
