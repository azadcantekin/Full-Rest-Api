package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlama.io.hrms.service.abstracts.JobPositionService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobs")
public class JobPositionController {

	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/get-all")
	public DataResult< List<JobPosition>> getAll(){
		return this.jobPositionService.getall();
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
	
}
