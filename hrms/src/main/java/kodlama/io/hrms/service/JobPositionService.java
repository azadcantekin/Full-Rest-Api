package kodlama.io.hrms.service;

import java.util.List;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobPosition;


public interface JobPositionService {

	DataResult<List<JobPosition>> getall() ;
	Result add (JobPosition jobPosition);
	
}
