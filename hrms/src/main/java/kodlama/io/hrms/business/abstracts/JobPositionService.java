package kodlama.io.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.entities.concretes.JobPosition;


public interface JobPositionService {

	List<JobPosition> getAll();
}
