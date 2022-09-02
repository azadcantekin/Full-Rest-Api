package kodlama.io.hrms.service;

import java.util.List;


import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.domain.Employer;
import kodlama.io.hrms.entities.dto.EmployerModel;

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(EmployerModel employerModel);
}
