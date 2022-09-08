package kodlama.io.hrms.service;


import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.dto.UserModel;

import java.util.List;


public interface UserService {
    List<UserModel> getAllUser();

    String addUser(UserModel userModel);

    String signIn(String email , String password);

    String refresh(String email);

    DataResult<UserModel> deleteUser(String id);

    DataResult<UserModel> findByEmail(String email);

}
