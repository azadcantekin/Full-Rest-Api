package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.AdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Advertisement;


@RestController
@RequestMapping("advertisement")
public class AdvertisementController {

	
	private AdvertisementService advertisementService;

	@Autowired
	public AdvertisementController(AdvertisementService advertisementService) {
		this.advertisementService = advertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Advertisement advertisement ) {
		return this.advertisementService.addAdvertisement(advertisement);
		
	}
	@GetMapping("/getall")
	public DataResult<List<Advertisement>> getAll(){
		return this.advertisementService.getAll();
	}
	
	@GetMapping("/get-all-active")
	public List<Advertisement> findAllByIsActiveTrue(){
		return this.advertisementService.findAllByIsActiveTrue();
	}
	
	

}
