package kodlama.io.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import kodlama.io.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "verification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Verification extends EntityWithUUID{


    private static final long serialVersionUID = 3397083442024484678L;


    @Column(name = "is_verficate")
    private boolean isVerficate;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id")
    private User user;


}
