package kodlama.io.hrms.entities.dto;


import kodlama.io.hrms.entities.concretes.Advertisement;
import kodlama.io.hrms.entities.concretes.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@SuperBuilder
@Getter
@Setter
public class EmployerModel extends BaseDto{

    private String companyName;
    private String webSite;
    private String phoneNumber;
    private User user;
    private List<Advertisement> advertisements;

    public EmployerModel(String id, String companyName, String webSite, String phoneNumber, User user, List<Advertisement> advertisements) {
        super(id);
        this.companyName = companyName;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
        this.user = user;
        this.advertisements = advertisements;
    }
}
