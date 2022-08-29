package kodlama.io.hrms.entities.dto;

import kodlama.io.hrms.entities.concretes.Resume;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@SuperBuilder
@Getter
@Setter
public class ExperienceModel extends BaseDto{

    private String title;
    private String explanation;
    private Date startDate;
    private Date endDate;
    private Boolean isActive;
    private Resume resume;

    public ExperienceModel(String id, String title, String explanation, Date startDate, Date endDate, Boolean isActive, Resume resume) {
        super(id);
        this.title = title;
        this.explanation = explanation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
        this.resume = resume;
    }
}
