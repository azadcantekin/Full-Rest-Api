package kodlama.io.hrms.service.mapper;

import kodlama.io.hrms.core.mapper.impl.BaseMapperImpl;
import kodlama.io.hrms.entities.domain.Experience;
import kodlama.io.hrms.entities.dto.ExperienceModel;
import org.springframework.stereotype.Component;

@Component
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
