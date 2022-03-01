package kodlama.io.hrms.service.abstracts;


import kodlama.io.hrms.entities.concretes.User;
import kodlama.io.hrms.entities.dto.UserModel;

public interface UserService {

    UserModel add(UserModel userModel);
    UserModel findByEmail (String email);
}
