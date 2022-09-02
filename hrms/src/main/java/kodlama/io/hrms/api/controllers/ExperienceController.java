package kodlama.io.hrms.api.controllers;

import io.swagger.models.Response;
import kodlama.io.hrms.entities.dto.ExperienceModel;
import kodlama.io.hrms.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;



    @PostMapping("add-experience")
    public ResponseEntity<?> addExperience(@RequestBody ExperienceModel experienceModel){
        return ResponseEntity.ok(this.experienceService.addExperience(experienceModel));
    }

    @GetMapping("get-by-date")
    public ResponseEntity<?> findAllByOrderByStartDateDesc(){
        return ResponseEntity.ok(this.experienceService.findAllByOrderByStartDateDesc());
    }
}
