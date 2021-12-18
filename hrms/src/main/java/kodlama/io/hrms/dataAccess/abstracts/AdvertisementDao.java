package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import kodlama.io.hrms.entities.concretes.Advertisement;



public interface AdvertisementDao extends JpaRepository<Advertisement, Long>{
	
	
	 List<Advertisement> findAllByIsActiveTrue();
}
