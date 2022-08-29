package kodlama.io.hrms.entities.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@Setter
public abstract class BaseDto {

    private String id;

    public BaseDto(String id) {
        this.id = id;
    }
}
