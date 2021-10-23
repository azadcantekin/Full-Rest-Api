package kodlama.io.hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="user" ,uniqueConstraints={@UniqueConstraint(columnNames ={"email"})})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotNull
	@Column(name="email")
	private String email;
	@NotNull
	@Column(name="password")
	private String password;
	
}
