package kodlama.io.hrms.service.impl;

import java.util.List;

import kodlama.io.hrms.entities.dto.EmployerModel;
import kodlama.io.hrms.service.mapper.EmployerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.repo.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private EmployerMapper mapper;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "All Employers has been listed .");
	}

	@Override
	public Result add(EmployerModel employerModel) {
		this.employerDao.save(mapper.checkAndConvertToEntity(employerModel));
		return new SuccessResult("Employer has been added .");
	}

	

}
