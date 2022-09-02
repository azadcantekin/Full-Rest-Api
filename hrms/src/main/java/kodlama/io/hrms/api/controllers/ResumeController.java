package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.entities.dto.ResumeModel;
import kodlama.io.hrms.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("add-resume")
    public ResponseEntity<?> addResume(@RequestBody ResumeModel resumeModel){
      return  ResponseEntity.ok(this.resumeService.addResume(resumeModel));
    }
}
