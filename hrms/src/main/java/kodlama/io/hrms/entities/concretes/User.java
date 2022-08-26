package kodlama.io.hrms.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name="users")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends EntityWithUUID {

    private static final long serialVersionUID = -5007611868455170026L;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @OneToMany
    private List<Employer> employers;
    @OneToMany
    private List<JobSeeker> jobSeekers;
    @OneToMany
    private List<Verification> verifications;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


}
