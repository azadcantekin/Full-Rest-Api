package kodlama.io.hrms.api.controllers;

import java.util.List;

import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import kodlama.io.hrms.business.abstracts.AdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;



@RestController
@RequestMapping("advertisement")
public class AdvertisementController {

	
	private AdvertisementService advertisementService;

	@Autowired
	public AdvertisementController(AdvertisementService advertisementService) {
		this.advertisementService = advertisementService;
	}
	
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
		return ResponseEntity.ok(this.advertisementService.findAllByIsActiveTrue());
	}
	
	

}
