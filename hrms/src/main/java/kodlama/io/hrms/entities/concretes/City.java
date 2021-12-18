package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City extends EntityWithUUID {


	@Column(name="name")
	private String name;

}
