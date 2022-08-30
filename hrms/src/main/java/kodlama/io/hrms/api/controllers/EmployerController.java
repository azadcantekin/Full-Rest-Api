package kodlama.io.hrms.api.controllers;

import java.util.List;

import kodlama.io.hrms.entities.dto.EmployerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.hrms.service.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

	@Autowired
	private EmployerService employerService;



	@GetMapping("/get-all")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployerModel employerModel) {
		return this.employerService.add(employerModel);
		
	}
	
}
