package kodlama.io.hrms.entities.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kodlama.io.hrms.entities.concretes.City;
import kodlama.io.hrms.entities.concretes.Employer;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertisementModel extends BaseDto{

    private String definition;
    private City city;
    private int positionNumber;
    private boolean active;
    private Date lastApplicationDate;
    private String companyName;
    private Employer employer;

    public AdvertisementModel(String id, String definition, City city, int positionNumber, boolean active, Date lastApplicationDate, String companyName, Employer employer) {
        super(id);
        this.definition = definition;
        this.city = city;
        this.positionNumber = positionNumber;
        this.active = active;
        this.lastApplicationDate = lastApplicationDate;
        this.companyName = companyName;
        this.employer = employer;
    }


    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(int positionNumber) {
        this.positionNumber = positionNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getLastApplicationDate() {
        return lastApplicationDate;
    }

    public void setLastApplicationDate(Date lastApplicationDate) {
        this.lastApplicationDate = lastApplicationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }


}
