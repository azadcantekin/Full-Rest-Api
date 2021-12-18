package kodlama.io.hrms.business.mapper;


import kodlama.io.hrms.core.mapper.concretes.BaseMapperImpl;
import kodlama.io.hrms.entities.concretes.Advertisement;
import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.stereotype.Component;


@Component
public class AdvertisementMapper extends BaseMapperImpl<Advertisement , AdvertisementModel> {

    @Override
    public Advertisement convertToEntity(AdvertisementModel advertisementModel) {
       Advertisement advertisement = new Advertisement();
       advertisement.setId(advertisementModel.getId());
       advertisement.setActive(advertisementModel.isActive());
       advertisement.setCity(advertisementModel.getCity());
       advertisement.setDefinition(advertisement.getDefinition());
       advertisement.setEmployer(advertisement.getEmployer());
       advertisement.setLastApplicationDate(advertisementModel.getLastApplicationDate());

        return advertisement;
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
