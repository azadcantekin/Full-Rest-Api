package kodlama.io.hrms.entities.domain;

import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SuperBuilder
public class EntityWithUUID implements Serializable {


    private static final long serialVersionUID = 3110262183799511275L;

    @Id
    @Type(type = "pg-uuid")
    private UUID id = UUID.randomUUID();


    public EntityWithUUID (){
        if(id==null){
            this.id=UUID.randomUUID();
        }
    }

    public EntityWithUUID(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setId(String id) {
        if(id==null){
            return ;
        }
        this.id = UUID.fromString(id);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1 ;
        result = prime * result + (((id == null)) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }if(obj==null){
            return false;
        }if(getClass()!= obj.getClass())
            return false;
            EntityWithUUID other = (EntityWithUUID) obj;
        if(id==null){
            if(other.id==null)
                return false;
                    }
        else if (id.equals(other.id))
            return false;
        return true;
    }

}
