package kodlama.io.hrms.entities.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.sun.istack.NotNull;
import lombok.*;


@Entity
@Table(name = "job_seeker")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobSeeker extends EntityWithUUID {


    private static final long serialVersionUID = -3483402176423640198L;


    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @NotNull
    @Column(name = "national_id", nullable = false)
    private String nationalId;
    @NotNull
    @Column(name = "birth_date", nullable = false)
    private String birthDate;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id")
    private User user;



}
