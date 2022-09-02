package kodlama.io.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.hrms.entities.domain.JobPosition;

@Repository
public interface JobPositionRepo extends JpaRepository<JobPosition, Integer>{

}
