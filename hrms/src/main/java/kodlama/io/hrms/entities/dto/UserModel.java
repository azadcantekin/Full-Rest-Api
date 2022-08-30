package kodlama.io.hrms.entities.dto;




import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class UserModel extends BaseDto{

    private String id;
    private String email;
    private String password;

    public UserModel(String id, String email, String password) {
        super(id);
        this.email = email;
        this.password = password;
    }

    public UserModel() {

    }

}
