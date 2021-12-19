package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name="language")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Language extends EntityWithUUID{

    private String name ;
    private int level;
}
