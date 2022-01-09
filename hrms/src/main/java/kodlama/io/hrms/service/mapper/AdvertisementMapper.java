package kodlama.io.hrms.service.mapper;


import kodlama.io.hrms.core.mapper.concretes.BaseMapperImpl;
import kodlama.io.hrms.entities.concretes.Advertisement;
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
                .isActive(advertisementModel.isActive())
                .lastApplicationDate(advertisementModel.getLastApplicationDate())
                .employer(advertisementModel.getEmployer())
                .build()
                ;
    }

    @Override
    public AdvertisementModel convertToDto(Advertisement entity) {
        return AdvertisementModel.builder().positionNumber(entity.getPositionNumber())
                .city(entity.getCity())
                .definition(entity.getDefinition())
                .build()
                ;
    }
}
