package kodlama.io.hrms.api.controllers;

import java.util.List;

import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import kodlama.io.hrms.service.AdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;



@RestController
@RequestMapping("api/advertisement")
public class AdvertisementController {

	@Autowired
	private AdvertisementService advertisementService;



	
	@PostMapping("/add")
	public Result add(@RequestBody AdvertisementModel advertisementModel ) {
		return this.advertisementService.addAdvertisement(advertisementModel);
		
	}

	@GetMapping("/getall")
	public DataResult<List<AdvertisementModel>> getAll(){
		return this.advertisementService.getAll();
	}
	
	@GetMapping("/get-all-active")
	public ResponseEntity<?> findAllByIsActiveTrue(){
		return ResponseEntity.ok(this.advertisementService.findAllByActiveTrue());
	}
	
	@GetMapping("/get-all-by-date")
	public ResponseEntity<?> findAllByOrderByLastApplicationDate(){
		return ResponseEntity.ok(this.advertisementService.findAllByActiveTrueOrderByLastApplicationDate());
	}

	@GetMapping("get-all-by-company")
	public ResponseEntity<?> findAllByCompanyName(@RequestParam String companyName){
		return ResponseEntity.ok(this.advertisementService.findAllByCompanyName(companyName));
	}

	@PutMapping("/{id}/update-active")
	public ResponseEntity<?> updateIsActive(@PathVariable String id , @RequestBody boolean active) throws Exception {
		return ResponseEntity.ok(this.advertisementService.updateIsActive(id,active));
	}



}
