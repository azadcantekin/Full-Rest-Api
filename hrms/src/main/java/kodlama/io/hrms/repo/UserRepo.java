package kodlama.io.hrms.repo;

import kodlama.io.hrms.entities.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {

    User findByEmail (String email);
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN TRUE ELSE FALSE END FROM User u WHERE u.email =?1")
    Boolean selectExistEmail(String email);


}
