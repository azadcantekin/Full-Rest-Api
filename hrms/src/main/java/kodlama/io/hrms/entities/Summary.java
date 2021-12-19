package kodlama.io.hrms.entities;

import kodlama.io.hrms.entities.concretes.EntityWithUUID;
import kodlama.io.hrms.entities.concretes.Resume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Table(name = "summary")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Summary extends EntityWithUUID {

    private String title;
    private String contents;
    @ManyToOne
    @JoinColumn(name="resume_id")
    private Resume resume;
}
