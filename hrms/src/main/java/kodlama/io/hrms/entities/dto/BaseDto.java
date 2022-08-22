package kodlama.io.hrms.entities.dto;


import lombok.experimental.SuperBuilder;


@SuperBuilder
public abstract class BaseDto {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BaseDto(String id) {
        this.id = id;
    }
}
