package kodlama.io.hrms.service.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.abstracts.JobPositionService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.repo.JobPositionDao;
import kodlama.io.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	@Autowired
	private JobPositionDao jobPositionDao;
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public DataResult<List<JobPosition>> getall() {
	
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data has been listed .");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Position has been added.");
	}

}
