package kodlama.io.hrms.entities.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@Getter
@Setter
@NoArgsConstructor
public class ResumeModel extends BaseDto {

    private String title;
    private String explanation;
    private String skill;
}
