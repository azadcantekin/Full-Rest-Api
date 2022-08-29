package kodlama.io.hrms.entities.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kodlama.io.hrms.entities.concretes.City;
import kodlama.io.hrms.entities.concretes.Employer;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@SuperBuilder
@Getter
@Setter
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
}
