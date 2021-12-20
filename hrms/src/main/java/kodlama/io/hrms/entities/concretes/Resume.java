package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="resume")
@AllArgsConstructor
@NoArgsConstructor
public class Resume extends  EntityWithUUID{


    private static final long serialVersionUID = -2346768516203802329L;


    @OneToMany(mappedBy = "resume")
    private List<Experience>  experience;
    @OneToMany(mappedBy = "resume")
    private List<School>  schools;
    @OneToMany(mappedBy = "resume_id")
    private List<SocialMedia> socialMedia;



}
