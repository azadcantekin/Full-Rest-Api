package kodlama.io.hrms.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="resume")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Resume extends  EntityWithUUID{


    private static final long serialVersionUID = -2346768516203802329L;


    @OneToMany(mappedBy = "resume")
    private List<Experience>  experience;
    @OneToMany(mappedBy = "resume")
    private List<School>  schools;




}
