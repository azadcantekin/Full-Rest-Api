package kodlama.io.hrms.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	Employer findById(String id);

}
