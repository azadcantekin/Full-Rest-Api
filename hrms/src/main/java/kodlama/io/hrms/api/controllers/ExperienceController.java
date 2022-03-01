package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.service.abstracts.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experience")
public class ExperienceController {


    private ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("get-by-date")
    public ResponseEntity<?> findAllByOrderByStartDateDesc(){
        return ResponseEntity.ok(this.experienceService.findAllByOrderByStartDateDesc());
    }
}
