package kodlama.io.hrms.service.abstracts;

import kodlama.io.hrms.entities.dto.ExperienceModel;

import java.util.List;

public interface ExperienceService {

    List<ExperienceModel> findAllByOrderByStartDateDesc();
}
