package kodlama.io.hrms.service.abstracts;

import java.util.List;


import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getall();
	Result add(Employer employer);
}
