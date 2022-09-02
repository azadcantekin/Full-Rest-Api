package kodlama.io.hrms.entities.dto;


import kodlama.io.hrms.entities.domain.Advertisement;
import kodlama.io.hrms.entities.domain.User;
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
