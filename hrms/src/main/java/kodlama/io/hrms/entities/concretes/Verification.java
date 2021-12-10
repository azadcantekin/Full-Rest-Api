package kodlama.io.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import kodlama.io.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="verification")
public class Verification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="verification_id")
	private Long id;
	@Column(name="is_verficate")
	private boolean isVerficate;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="user_id")
	private User user;
	
	public Verification(Long id, boolean isVerficate, User user) {
		super();
		this.id = id;
		this.isVerficate = isVerficate;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isVerficate() {
		return isVerficate;
	}

	public void setVerficate(boolean isVerficate) {
		this.isVerficate = isVerficate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
