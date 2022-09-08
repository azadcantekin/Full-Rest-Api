package kodlama.io.hrms.service;

import java.util.List;


import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.dto.AdvertisementModel;

public interface AdvertisementService {

    Result addAdvertisement(AdvertisementModel advertisementModel);
    DataResult<List<AdvertisementModel>> getAll();
    DataResult<List<AdvertisementModel>> findAllByActiveTrue();
    DataResult<List<AdvertisementModel>> findAllByActiveTrueOrderByLastApplicationDate();
    DataResult<AdvertisementModel> updateIsActive(String id , boolean active) throws Exception;
    DataResult<List<AdvertisementModel>> findAllByCompanyName(String companyName);

}
