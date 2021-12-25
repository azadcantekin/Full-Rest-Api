package kodlama.io.hrms.entities.dto;

import kodlama.io.hrms.entities.concretes.Resume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ExperienceModel extends BaseDto{

    private String title;
    private String explanation;
    private Date startDate;
    private Date endDate;
    private Boolean isActive;
    private Resume resume;
}
