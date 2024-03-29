package kodlama.io.hrms.entities.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name="language")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Language extends EntityWithUUID{

    private static final long serialVersionUID = 2712578665011066526L;


    private String name ;
    private int level;
}
