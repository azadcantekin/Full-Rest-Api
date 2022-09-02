package kodlama.io.hrms.entities.domain;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name="employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Employer extends EntityWithUUID{

	private static final long serialVersionUID = -9175128298092611420L;


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

}
