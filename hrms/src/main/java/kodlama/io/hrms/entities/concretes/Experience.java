package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Table(name="experience")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Experience extends EntityWithUUID{

    private static final long serialVersionUID = -5106394654719934343L;


    private String title;
    private String explanation;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;
}
