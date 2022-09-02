package kodlama.io.hrms.entities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "system_worker")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SystemWorker extends EntityWithUUID{


    private static final long serialVersionUID = -425910591133196034L;


    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;


}
