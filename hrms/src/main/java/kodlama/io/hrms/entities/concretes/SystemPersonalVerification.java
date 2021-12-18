package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "system_personal_verification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonalVerification extends EntityWithUUID {

	

	@Column(name="is_verficate")
	private boolean isVerficate;
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
}
