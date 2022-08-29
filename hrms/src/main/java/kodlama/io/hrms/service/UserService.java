package kodlama.io.hrms.service;



import kodlama.io.hrms.entities.dto.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getAllUser();
    UserModel addUser(UserModel userModel);
    UserModel deleteUser(String id);
    UserModel findByEmail (String email);
    UserModel selectExistEmail(String email);

}
