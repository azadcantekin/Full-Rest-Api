package kodlama.io.hrms.core.entities;




import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import kodlama.io.hrms.entities.concretes.Verification;


@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@OneToMany
	private List<Employer> employers;
	@OneToMany
	private List<JobSeeker> jobSeekers;
	@OneToMany
	private List<Verification> verifications;
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	

	public List<Employer> getEmployers() {
		return employers;
	}



	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}



	public List<JobSeeker> getJobSeekers() {
		return jobSeekers;
	}



	public void setJobSeekers(List<JobSeeker> jobSeekers) {
		this.jobSeekers = jobSeekers;
	}



	public List<Verification> getVerifications() {
		return verifications;
	}



	public void setVerifications(List<Verification> verifications) {
		this.verifications = verifications;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
