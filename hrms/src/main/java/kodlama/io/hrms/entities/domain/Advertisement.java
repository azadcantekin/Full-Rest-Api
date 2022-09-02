package kodlama.io.hrms.entities.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="adversiment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Advertisement extends EntityWithUUID{


	private static final long serialVersionUID = 3757831847793413617L;


	@Column(name="definition")
	private String definition;
	@ManyToOne
	@JoinColumn(name="city_id" )
	private City city;
	@Column(name="position_number")
	private int positionNumber;
	@Column(name="last_application_date")
	private Date lastApplicationDate;
	@Column(name="active")
	private boolean active;
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	@Column(name = "company_name")
	private String companyName;

}
