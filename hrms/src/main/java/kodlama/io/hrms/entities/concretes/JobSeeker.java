package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seeker" ,uniqueConstraints={@UniqueConstraint(columnNames ={"national_id"})})
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotNull
	@Column(name="first_name"  )
	private String firstName;
	@NotNull
	@Column(name="last_name")
	private String lastName;
	@NotNull
	@Column(name="national_id")
	private String nationalId;
	@NotNull
	@Column(name="birth_date")
	private String birthDate;
	
	
}
