package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.service.ExperienceService;
import kodlama.io.hrms.service.mapper.ExperienceMapper;
import kodlama.io.hrms.repo.ExperienceRepo;
import kodlama.io.hrms.entities.concretes.Experience;
import kodlama.io.hrms.entities.dto.ExperienceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExperienceImpl implements ExperienceService {
    @Autowired
    private ExperienceRepo experienceRepo;
    private ExperienceMapper experienceMapper;

    public ExperienceImpl(ExperienceRepo experienceRepo, ExperienceMapper experienceMapper) {
        this.experienceRepo = experienceRepo;
        this.experienceMapper = experienceMapper;
    }

    @Override
    public List<ExperienceModel> findAllByOrderByStartDateDesc() {
        List<Experience> experienceList = this.experienceRepo.findAllByOrderByStartDateDesc();
        List<ExperienceModel> experienceModelList = new ArrayList<>();
        for (Experience experience : experienceList) {
            experienceModelList.add(experienceMapper.convertToDto(experience));
        }


        return experienceModelList;
    }
}
