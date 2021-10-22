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
	@NotNull
	private int id;
	@Column(name="first_name" , nullable=false )
	private String firstName;
	@Column(name="last_name" , nullable=false)
	private String lastName;
	@Column(name="national_id" , nullable=false )
	private String nationalId;
	@Column(name="birth_date" , nullable=false )
	private String birthDate;
	
	
}
