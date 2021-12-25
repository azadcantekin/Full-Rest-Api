package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.EntityWithUUID;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import kodlama.io.hrms.entities.concretes.Verification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends EntityWithUUID {

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



}
