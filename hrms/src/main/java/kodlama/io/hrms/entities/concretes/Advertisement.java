package kodlama.io.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;

@Entity
@Table(name="adversiment")
public class Advertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
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
	private int positionNumer;
	@Column(name="last_application_date")
	private Date lastApplicationDate;
	@Column(name="is_active")
	private boolean isActive;
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	
	
	
	
	public Advertisement() {
		
	}


	public Advertisement(Long id, String definition, City city, int positionNumer, Date lastApplicationDate,
			Boolean isActive, Employer employer) {
		super();
		this.id = id;
		this.definition = definition;
		this.city = city;
		this.positionNumer = positionNumer;
		this.lastApplicationDate = lastApplicationDate;
		this.isActive = isActive;
		this.employer = employer;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public int getPositionNumer() {
		return positionNumer;
	}


	public void setPositionNumer(int positionNumer) {
		this.positionNumer = positionNumer;
	}


	public Date getLastApplicationDate() {
		return lastApplicationDate;
	}


	public void setLastApplicationDate(Date lastApplicationDate) {
		this.lastApplicationDate = lastApplicationDate;
	}
	
	public Employer getEmployer() {
		return employer;
	}



	public void setEmployer(Employer employer) {
		this.employer = employer;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", definition=" + definition + ", city=" + city + ", positionNumer="
				+ positionNumer + ", lastApplicationDate=" + lastApplicationDate + ", isActive=" + isActive
				+ ", employer=" + employer + ", getId()=" + getId() + ", getDefinition()=" + getDefinition()
				+ ", getCity()=" + getCity() + ", getPositionNumer()=" + getPositionNumer()
				+ ", getLastApplicationDate()=" + getLastApplicationDate() + ", getEmployer()=" + getEmployer()
				+ ", getIsActive()=" + getIsActive() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
