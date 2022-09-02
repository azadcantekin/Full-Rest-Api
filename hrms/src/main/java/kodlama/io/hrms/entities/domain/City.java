package kodlama.io.hrms.entities.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class City extends EntityWithUUID {


	private static final long serialVersionUID = 4682683801732359339L;

	@Column(name="name")
	private String name;

}
