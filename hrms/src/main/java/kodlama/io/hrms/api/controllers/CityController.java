package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/get-all-cities")
    public ResponseEntity<?> getAllCities(){
        return ResponseEntity.ok(this.cityService.getAllCities());
    }
}
