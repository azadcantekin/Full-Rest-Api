package kodlama.io.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.domain.JobSeeker;

import java.util.UUID;

public interface JobSeekerRepo extends JpaRepository<JobSeeker, UUID> {

}
