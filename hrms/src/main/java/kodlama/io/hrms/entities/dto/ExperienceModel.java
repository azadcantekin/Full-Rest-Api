package kodlama.io.hrms.entities.dto;

import kodlama.io.hrms.entities.domain.Resume;
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
public class ExperienceModel extends BaseDto{

    private String title;
    private String explanation;
    private Date startDate;
    private Date endDate;
    private Boolean isActive;
    private Resume resume;

}
