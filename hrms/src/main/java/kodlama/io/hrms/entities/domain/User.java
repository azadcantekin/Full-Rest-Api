package kodlama.io.hrms.entities.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

import kodlama.io.hrms.entities.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name = "users")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends EntityWithUUID {

    private static final long serialVersionUID = -5007611868455170026L;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<UserRole> roles = new ArrayList<>();
    @OneToMany
    private List<Employer> employers;
    @OneToMany
    private List<JobSeeker> jobSeekers;
    @OneToMany
    private List<Verification> verifications;


}
