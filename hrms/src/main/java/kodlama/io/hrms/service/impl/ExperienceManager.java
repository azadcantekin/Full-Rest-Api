package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.service.abstracts.ExperienceService;
import kodlama.io.hrms.service.mapper.ExperienceMapper;
import kodlama.io.hrms.repo.ExperienceDao;
import kodlama.io.hrms.entities.concretes.Experience;
import kodlama.io.hrms.entities.dto.ExperienceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExperienceManager implements ExperienceService {

    private ExperienceDao experienceDao;
    private ExperienceMapper experienceMapper;
    @Autowired
    public ExperienceManager(ExperienceDao experienceDao, ExperienceMapper experienceMapper) {
        this.experienceDao = experienceDao;
        this.experienceMapper = experienceMapper;
    }

    @Override
    public List<ExperienceModel> findAllByOrderByStartDateDesc() {
        List<Experience> experienceList = this.experienceDao.findAllByOrderByStartDateDesc();
        List<ExperienceModel> experienceModelList = new ArrayList<>();
        for (Experience experience:experienceList) {
            experienceModelList.add(experienceMapper.convertToDto(experience));
        }


        return experienceModelList;
    }
}
