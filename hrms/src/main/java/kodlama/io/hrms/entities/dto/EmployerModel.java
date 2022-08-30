package kodlama.io.hrms.entities.dto;


import kodlama.io.hrms.entities.concretes.Advertisement;
import kodlama.io.hrms.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployerModel extends BaseDto{

    private String companyName;
    private String webSite;
    private String phoneNumber;
    private User user;
    private List<Advertisement> advertisements;

}
