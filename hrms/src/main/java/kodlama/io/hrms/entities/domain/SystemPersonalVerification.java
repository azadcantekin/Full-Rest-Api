package kodlama.io.hrms.entities.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "system_personal_verification")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SystemPersonalVerification extends EntityWithUUID {


	private static final long serialVersionUID = -2515734695814161799L;


	@Column(name="is_verficate")
	private boolean isVerficate;
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
}
