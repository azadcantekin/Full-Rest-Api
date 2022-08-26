package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;


@Entity
@Table(name="mernis_verification")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MernisVerification extends EntityWithUUID{


	private static final long serialVersionUID = 5657625148459786407L;


	@Column(name="is_verficate")
	private boolean isVerficate;
	@ManyToOne
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
}
