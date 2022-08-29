package kodlama.io.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.JobSeekerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.repo.JobSeekerRepo;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerImpl implements JobSeekerService{
	@Autowired
	private JobSeekerRepo jobSeekerRepo;

	public JobSeekerImpl(JobSeekerRepo jobSeekerRepo) {
		this.jobSeekerRepo = jobSeekerRepo;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerRepo.findAll(), "Job seeker has been listed .");
	}

}
