package kodlama.io.hrms.service;


import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.dto.UserModel;

import java.util.List;


public interface UserService {
    List<UserModel> getAllUser();

    DataResult<UserModel> findByUsername(String username);

    DataResult<UserModel> addUser(UserModel userModel);

    void addRoleToUser(String userName, String name);

    DataResult<UserModel> deleteUser(String id);

    DataResult<UserModel> findByEmail(String email);

}
