package kodlama.io.hrms.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.experimental.SuperBuilder;


@Entity
@Table(name="users")
@SuperBuilder
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


    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(List<Employer> employers) {
        this.employers = employers;
    }

    public List<JobSeeker> getJobSeekers() {
        return jobSeekers;
    }

    public void setJobSeekers(List<JobSeeker> jobSeekers) {
        this.jobSeekers = jobSeekers;
    }

    public List<Verification> getVerifications() {
        return verifications;
    }

    public void setVerifications(List<Verification> verifications) {
        this.verifications = verifications;
    }


}
