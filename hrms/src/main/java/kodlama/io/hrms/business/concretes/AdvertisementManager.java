package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.AdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.AdvertisementDao;

import kodlama.io.hrms.entities.concretes.Advertisement;


@Service
public class AdvertisementManager implements AdvertisementService{
	
	private AdvertisementDao advertisementDao;

	
	
	@Autowired
	public AdvertisementManager(AdvertisementDao advertisementDao) {
		this.advertisementDao = advertisementDao;
	
	}



	@Override
	public Result addAdvertisement(Advertisement advertisement ) {
		this.advertisementDao.save(advertisement);
		return new SuccessResult("Data listelendi");
	}



	@Override
	public DataResult<List<Advertisement>> getAll() {
		return new SuccessDataResult<>(this.advertisementDao.findAll(),"Data has been listed");
	}



	@Override
	public List<Advertisement> findAllByIsActiveTrue() {
		
		return this.advertisementDao.findAllByIsActiveTrue();
	}




}






