package kodlama.io.hrms.entities.dto;


import kodlama.io.hrms.entities.concretes.Advertisement;
import kodlama.io.hrms.entities.concretes.User;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class EmployerModel extends BaseDto{

    private String companyName;
    private String webSite;
    private String phoneNumber;
    private User user;
    private List<Advertisement> advertisements;
}
