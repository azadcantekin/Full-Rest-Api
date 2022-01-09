package kodlama.io.hrms.service.mapper;

import kodlama.io.hrms.core.mapper.concretes.BaseMapperImpl;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.dto.EmployerModel;
import org.springframework.stereotype.Component;


@Component
public class EmployerMapper extends BaseMapperImpl<Employer, EmployerModel> {

    @Override
    public Employer convertToEntity(EmployerModel dto) {
        return Employer.builder()
                .user(dto.getUser())
                .webSite(dto.getWebSite())
                .companyName(dto.getCompanyName())
                .advertisements(dto.getAdvertisements())
                .phoneNumber(dto.getPhoneNumber())
                .build();
    }

    @Override
    public EmployerModel convertToDto(Employer entity) {
        return  EmployerModel.builder()
                .webSite(entity.getWebSite())
                .companyName(entity.getCompanyName())
                .phoneNumber(entity.getPhoneNumber())
                .user(entity.getUser())
                .advertisements(entity.getAdvertisements())
                .build()
                ;
    }
}
