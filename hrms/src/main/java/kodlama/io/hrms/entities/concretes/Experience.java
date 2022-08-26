package kodlama.io.hrms.entities.concretes;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Table(name="experience")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Experience extends EntityWithUUID{

    private static final long serialVersionUID = -5106394654719934343L;


    private String title;
    private String explanation;
    private Date startDate;
    private Date endDate;
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;
}
