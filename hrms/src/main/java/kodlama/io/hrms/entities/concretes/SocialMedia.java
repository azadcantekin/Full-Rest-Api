package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="social_media")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SocialMedia extends EntityWithUUID{

    private String mediaName;
    private String uri;
    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;


}
