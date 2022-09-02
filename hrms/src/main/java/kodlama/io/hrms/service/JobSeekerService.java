package kodlama.io.hrms.service;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.domain.JobSeeker;

import java.util.List;
public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
}
