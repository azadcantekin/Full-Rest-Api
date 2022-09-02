package kodlama.io.hrms.service;

import kodlama.io.hrms.entities.dto.ExperienceModel;

import java.util.List;

public interface ExperienceService {

    ExperienceModel addExperience(ExperienceModel experienceModel);
    List<ExperienceModel> findAllByOrderByStartDateDesc();
}
