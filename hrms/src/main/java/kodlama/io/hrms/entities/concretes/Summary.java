package kodlama.io.hrms.entities.concretes;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Table(name = "summary")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Summary extends EntityWithUUID {

    private static final long serialVersionUID = 8702116174178928842L;

    private String title;
    private String contents;
    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;
}