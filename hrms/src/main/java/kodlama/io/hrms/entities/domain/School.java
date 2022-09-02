package kodlama.io.hrms.entities.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "school")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class School extends EntityWithUUID {

    private static final long serialVersionUID = -5066601000657948358L;


    private String schoolName;
    private String address;
    private String phoneNumber;
    private Date educationYear;
    private Date graduationYear;
    @ManyToOne
    @JoinColumn(name = "resume_id")
    private Resume resume;
}
