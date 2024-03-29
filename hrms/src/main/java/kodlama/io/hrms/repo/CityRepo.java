package kodlama.io.hrms.repo;

import kodlama.io.hrms.entities.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CityRepo extends JpaRepository<City, UUID> {

}
