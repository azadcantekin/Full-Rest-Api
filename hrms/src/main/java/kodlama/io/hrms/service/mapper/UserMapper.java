package kodlama.io.hrms.service.mapper;

import kodlama.io.hrms.core.mapper.concretes.BaseMapperImpl;
import kodlama.io.hrms.entities.concretes.User;
import kodlama.io.hrms.entities.dto.UserModel;
import org.springframework.stereotype.Component;



@Component
public class UserMapper extends BaseMapperImpl<User, UserModel> {

    @Override
    public User convertToEntity(UserModel dto) {
        return User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build()
                ;
    }

    @Override
    public UserModel convertToDto(User entity) {
        return UserModel.builder()
                .email(entity.getEmail())
                .password(entity.getPassword())
                .build()
                ;
    }
}
