package kodlama.io.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="job_position")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobPosition  extends EntityWithUUID{

	private static final long serialVersionUID = -1153823451786761572L;


	@Column(name="job_title")
	private String jobTitle;

}
