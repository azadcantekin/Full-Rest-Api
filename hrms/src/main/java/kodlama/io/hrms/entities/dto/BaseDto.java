package kodlama.io.hrms.entities.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@AllArgsConstructor
@Getter
@Setter
public abstract class BaseDto {

    private String id;


}
