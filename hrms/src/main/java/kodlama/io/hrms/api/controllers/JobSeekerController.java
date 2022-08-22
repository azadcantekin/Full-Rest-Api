package kodlama.io.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlama.io.hrms.service.JobSeekerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerController {
	@Autowired
	private JobSeekerService jobSeekerService;


	
	@GetMapping("/get-all")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}

}
