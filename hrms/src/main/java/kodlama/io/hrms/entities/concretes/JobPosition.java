package kodlama.io.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_position")
public class JobPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_position_id")
	private Long jobPositionId ;
	@Column(name="job_title")
	private String jobTitle;
	
	
	
	public JobPosition(Long jobPositionId, String jobTitle) {
		super();
		this.jobPositionId = jobPositionId;
		this.jobTitle = jobTitle;
	}



	public Long getJobPositionId() {
		return jobPositionId;
	}



	public void setJobPositionId(Long jobPositionId) {
		this.jobPositionId = jobPositionId;
	}



	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	
}
