package kodlama.io.hrms.entities.dto;


import kodlama.io.hrms.entities.concretes.Advertisement;
import kodlama.io.hrms.entities.concretes.User;
import lombok.experimental.SuperBuilder;

import java.util.List;


@SuperBuilder
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }
}
