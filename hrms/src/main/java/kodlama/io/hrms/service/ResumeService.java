package kodlama.io.hrms.service;

import kodlama.io.hrms.entities.dto.ResumeModel;


public interface ResumeService{
    ResumeModel addResume(ResumeModel resumeModel);
    ResumeModel getAllResume();
}
