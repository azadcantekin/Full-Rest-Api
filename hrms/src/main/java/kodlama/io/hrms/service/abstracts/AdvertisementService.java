package kodlama.io.hrms.service.abstracts;

import java.util.List;


import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Advertisement;
import kodlama.io.hrms.entities.dto.AdvertisementModel;

public interface AdvertisementService {

    Result addAdvertisement(AdvertisementModel advertisementModel);
    DataResult<List<AdvertisementModel>> getAll();
    List<AdvertisementModel> findAllByActiveTrue();
    List<AdvertisementModel> findAllByActiveTrueOrderByLastApplicationDate();
    AdvertisementModel updateIsActive(String id , boolean active) throws Exception;
    List<AdvertisementModel> findAllByCompanyName(String companyName);

}
