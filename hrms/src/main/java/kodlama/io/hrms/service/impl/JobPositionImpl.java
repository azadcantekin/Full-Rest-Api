package kodlama.io.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.JobPositionService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.repo.JobPositionRepo;
import kodlama.io.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionImpl implements JobPositionService {

	@Autowired
	private JobPositionRepo jobPositionRepo;
	public JobPositionImpl(JobPositionRepo jobPositionRepo) {
		super();
		this.jobPositionRepo = jobPositionRepo;
	}
	
	@Override
	public DataResult<List<JobPosition>> getall() {
	
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionRepo.findAll(),"Data has been listed .");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionRepo.save(jobPosition);
		return new SuccessResult("Position has been added.");
	}

}