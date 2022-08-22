package kodlama.io.hrms.entities.dto;

import kodlama.io.hrms.entities.concretes.Resume;
import lombok.experimental.SuperBuilder;

import java.util.Date;


@SuperBuilder
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
