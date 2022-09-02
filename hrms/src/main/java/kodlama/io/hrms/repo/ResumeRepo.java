package kodlama.io.hrms.repo;

import kodlama.io.hrms.entities.domain.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResumeRepo extends JpaRepository<Resume , UUID> {
}
