package kodlama.io.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_position")
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id ;
	@Column(name="job_title")
	private String jobTitle;
	
	
	


	

}
