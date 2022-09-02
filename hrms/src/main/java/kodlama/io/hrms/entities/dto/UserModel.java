package kodlama.io.hrms.entities.dto;




import kodlama.io.hrms.entities.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
public class UserModel extends BaseDto{


    private String username;
    private String email;
    private String password;
    private List<UserRole> roles = new ArrayList<>();



}
