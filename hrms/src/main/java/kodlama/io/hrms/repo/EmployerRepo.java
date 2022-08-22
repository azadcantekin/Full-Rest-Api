package kodlama.io.hrms.repo;


import kodlama.io.hrms.entities.dto.EmployerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Integer> {

	EmployerModel findById(String id);

}
