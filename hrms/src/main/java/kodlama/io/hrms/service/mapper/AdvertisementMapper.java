package kodlama.io.hrms.service.mapper;


import kodlama.io.hrms.core.mapper.impl.BaseMapperImpl;
import kodlama.io.hrms.entities.domain.Advertisement;
import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.stereotype.Component;


@Component
public class AdvertisementMapper extends BaseMapperImpl<Advertisement , AdvertisementModel> {

    @Override
    public Advertisement convertToEntity(AdvertisementModel advertisementModel) {


        return Advertisement.builder()
                .positionNumber(advertisementModel.getPositionNumber())
                .city(advertisementModel.getCity())
                .definition(advertisementModel.getDefinition())
                .active(advertisementModel.isActive())
                .lastApplicationDate(advertisementModel.getLastApplicationDate())
                .companyName(advertisementModel.getCompanyName())
                .employer(advertisementModel.getEmployer())
                .build()
                ;
    }

    @Override
    public AdvertisementModel convertToDto(Advertisement entity) {
        return AdvertisementModel.builder().positionNumber(entity.getPositionNumber())
                .city(entity.getCity())
                .active(entity.isActive())
                .definition(entity.getDefinition())
                .companyName(entity.getCompanyName())
                .build()
                ;
    }
}
