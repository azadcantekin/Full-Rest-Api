package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "system_worker")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemWorker extends EntityWithUUID{


    private static final long serialVersionUID = -425910591133196034L;


    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;


}
