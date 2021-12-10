package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Table(name="system_worker")
public class SystemWorker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="system_worker_id")
	private Long systemWorkerId;
	@Column(name="first_name",nullable = false)
	private String firstName;
	@Column(name="last_name",nullable = false)
	private String lastName;
	public SystemWorker(Long systemWorkerId, String firstName, String lastName) {
		super();
		this.systemWorkerId = systemWorkerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Long getSystemWorkerId() {
		return systemWorkerId;
	}
	public void setSystemWorkerId(Long systemWorkerId) {
		this.systemWorkerId = systemWorkerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
