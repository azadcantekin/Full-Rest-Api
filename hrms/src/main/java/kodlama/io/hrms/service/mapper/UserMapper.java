package kodlama.io.hrms.service.mapper;

import kodlama.io.hrms.core.mapper.impl.BaseMapperImpl;
import kodlama.io.hrms.entities.domain.User;
import kodlama.io.hrms.entities.dto.UserModel;
import org.springframework.stereotype.Component;



@Component
public class UserMapper extends BaseMapperImpl<User, UserModel> {

    @Override
    public User convertToEntity(UserModel dto) {
        return User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .roles(dto.getRoles())
                .build()
                ;
    }

    @Override
    public UserModel convertToDto(User entity) {
        return UserModel.builder()
                .email(entity.getEmail())
                .password(entity.getPassword())
                .roles(entity.getRoles())
                .build()
                ;
    }
}
