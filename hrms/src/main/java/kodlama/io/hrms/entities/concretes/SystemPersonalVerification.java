package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SystemPersonalVerification {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="is_verficate")
	private boolean isVerficate;
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
}
