package kodlama.io.hrms.entities.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kodlama.io.hrms.entities.concretes.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertisementModel extends BaseDto{

    private String definition;
    private City city;
    private int positionNumber;
    private boolean isActive;
    private Date lastApplicationDate;
}
