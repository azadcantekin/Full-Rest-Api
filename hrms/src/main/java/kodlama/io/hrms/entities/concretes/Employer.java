package kodlama.io.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.sun.istack.NotNull;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotNull
	@Column(name="company_name")
	private String companyName;
	@NotNull
	@Column(name="web_site")
	private String webSite;
	@NotNull
	@Column(name="phone_number" )
	private String phoneNumber;
	
	
}
