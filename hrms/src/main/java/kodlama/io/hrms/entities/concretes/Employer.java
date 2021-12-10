package kodlama.io.hrms.entities.concretes;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kodlama.io.hrms.core.entities.User;


@Entity
@Table(name="employers")
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employer_id" , nullable = false)
	private int employerId;
	@Column(name="company_name" ,nullable = false)
	private String companyName;
	@Column(name="web_site",nullable = false)
	private String webSite;
	@Column(name="phone_number",nullable = false )
	private String phoneNumber;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="user_id")
	private User user;
	@OneToMany
	private List<Advertisement> advertisements;
	
	public Employer() {
		
	}
	
	
	

	public Employer(int employerId, String companyName, String webSite, String phoneNumber, User user,
			List<Advertisement> advertisements) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
		this.user = user;
		this.advertisements = advertisements;
	}




	public int getEmployerId() {
		return employerId;
	}




	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}




	public List<Advertisement> getAdvertisements() {
		return advertisements;
	}




	public void setAdvertisements(List<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}




	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getWebSite() {
		return webSite;
	}


	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
}
