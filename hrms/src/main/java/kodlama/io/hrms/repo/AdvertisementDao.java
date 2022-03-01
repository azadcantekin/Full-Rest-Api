package kodlama.io.hrms.repo;

import java.util.List;
import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entities.concretes.Advertisement;
import org.springframework.data.jpa.repository.Query;


public interface AdvertisementDao extends JpaRepository<Advertisement, UUID>{

	 List<Advertisement> findAllByActiveTrue();
	List<Advertisement> findAllByActiveTrueOrderByLastApplicationDate();
	@Query("SELECT a FROM Advertisement a WHERE a.companyName =: companyName")
	List<Advertisement> findAllByCompanyName(String companyName);

}
