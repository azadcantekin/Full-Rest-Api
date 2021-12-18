package kodlama.io.hrms.business.abstracts;

import java.util.List;


import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.dto.AdvertisementModel;

public interface AdvertisementService {

	Result addAdvertisement(AdvertisementModel advertisementModel);
	DataResult<List<AdvertisementModel>> getAll();
	List<AdvertisementModel> findAllByIsActiveTrue();
		
}
