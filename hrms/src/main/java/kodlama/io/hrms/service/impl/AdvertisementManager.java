package kodlama.io.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.hrms.service.mapper.AdvertisementMapper;
import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.abstracts.AdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.repo.AdvertisementDao;

import kodlama.io.hrms.entities.concretes.Advertisement;


@Service
public class AdvertisementManager implements AdvertisementService{
	
	private final AdvertisementDao advertisementDao;
	private final AdvertisementMapper advertisementMapper;
	

	@Autowired
	public AdvertisementManager(AdvertisementDao advertisementDao, AdvertisementMapper advertisementMapper) {
		this.advertisementDao = advertisementDao;
		this.advertisementMapper = advertisementMapper;
	}



	@Override
	public Result addAdvertisement(AdvertisementModel advertisementModel ) {
		Advertisement entity = advertisementMapper.checkAndConvertToEntity(advertisementModel);
		this.advertisementDao.save(entity);
		return new SuccessResult("Data listelendi");
	}



	@Override
	public DataResult<List<AdvertisementModel>> getAll() {
		List<Advertisement> advertisementList = this.advertisementDao.findAll();
		List<AdvertisementModel> advertisementModelList = new ArrayList<>();
		for (Advertisement advertisement : advertisementList) {
			advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
		}

		return new SuccessDataResult<>(advertisementModelList,"Data has been listed");
	}



	@Override
	public List<AdvertisementModel> findAllByIsActiveTrue() {
		List<Advertisement> advertisementList = advertisementDao.findAllByIsActiveTrue();
		List<AdvertisementModel> advertisementModelList = new ArrayList<>();
		for (Advertisement advertisement: advertisementList) {
			advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
		}
		return advertisementModelList;
	}




}






