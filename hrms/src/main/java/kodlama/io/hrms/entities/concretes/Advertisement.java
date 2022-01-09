package kodlama.io.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="adversiment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Advertisement extends EntityWithUUID{


	private static final long serialVersionUID = 3757831847793413617L;


	@Column(name="definition")
	@NotBlank
	@NotNull
	private String definition;
	@ManyToOne
	@JoinColumn(name="city_id" )
	@NotBlank
	@NotNull
	private City city;
	@Column(name="position_number")
	@NotBlank
	@NotNull
	private int positionNumber;
	@Column(name="last_application_date")
	private Date lastApplicationDate;
	@Column(name="is_active")
	private boolean isActive;
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;

	
	

	
}
