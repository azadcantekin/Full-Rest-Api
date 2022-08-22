package kodlama.io.hrms.repo;

import kodlama.io.hrms.entities.concretes.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ExperienceRepo extends JpaRepository<Experience , UUID> {

    List<Experience> findAllByOrderByStartDateDesc();
}
