package kodlama.io.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker, Integer> {

}
