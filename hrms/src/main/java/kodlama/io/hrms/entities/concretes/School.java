package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "school")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class School extends EntityWithUUID {

    private String schoolName;
    private String address;
    private String phoneNumber;
    private Date educationYear;
    private Date graduationYear;
    @ManyToOne
    @JoinColumn(name = "resume_id")
    private Resume resume;
}
