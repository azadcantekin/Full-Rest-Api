package kodlama.io.hrms.entities.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kodlama.io.hrms.entities.concretes.City;
import kodlama.io.hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertisementModel extends BaseDto{

    private String definition;
    private City city;
    private int positionNumber;
    private boolean active;
    private Date lastApplicationDate;
    private String companyName;
    private Employer employer;

}
