package kodlama.io.hrms.service.mapper;

import kodlama.io.hrms.core.mapper.concretes.BaseMapperImpl;
import kodlama.io.hrms.entities.concretes.Experience;
import kodlama.io.hrms.entities.dto.ExperienceModel;
import org.springframework.stereotype.Service;

@Service
public class ExperienceMapper extends BaseMapperImpl<Experience , ExperienceModel> {

    @Override
    public Experience convertToEntity(ExperienceModel dto) {
        return super.convertToEntity(dto);
    }

    @Override
    public ExperienceModel convertToDto(Experience entity) {
        return  ExperienceModel.builder()
                .explanation(entity.getExplanation())
                .title(entity.getTitle())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .isActive(entity.getIsActive())
                .resume(entity.getResume())
                .build()
                ;
    }
}
