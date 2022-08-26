package kodlama.io.hrms.entities.concretes;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="social_media")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SocialMedia extends EntityWithUUID{

    private static final long serialVersionUID = 3093772082455027744L;


    private String mediaName;
    private String uri;
    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;


}
