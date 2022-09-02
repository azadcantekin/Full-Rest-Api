package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.entities.domain.Resume;
import kodlama.io.hrms.entities.dto.ResumeModel;
import kodlama.io.hrms.repo.ResumeRepo;
import kodlama.io.hrms.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {
    private final ResumeRepo resumeRepo;

    private static final String OK = "OK";
    private static final String NOK = "NOK";

    @Autowired
    public ResumeServiceImpl(ResumeRepo resumeRepo) {
        this.resumeRepo = resumeRepo;
    }

    @Override
    public ResumeModel addResume(ResumeModel resumeModel) {
      return null;
    }

    @Override
    public ResumeModel getAllResume() {
        List<Resume> resumeList = this.resumeRepo.findAll();
        return null;
    }
}
