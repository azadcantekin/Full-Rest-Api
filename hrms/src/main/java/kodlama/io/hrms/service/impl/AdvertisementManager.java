package kodlama.io.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
public class AdvertisementManager implements AdvertisementService {

    private final AdvertisementDao advertisementDao;
    private final AdvertisementMapper advertisementMapper;


    @Autowired
    public AdvertisementManager(AdvertisementDao advertisementDao, AdvertisementMapper advertisementMapper) {
        this.advertisementDao = advertisementDao;
        this.advertisementMapper = advertisementMapper;
    }


    @Override
    public Result addAdvertisement(AdvertisementModel advertisementModel) {
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

        return new SuccessDataResult<>(advertisementModelList, "Data has been listed");
    }


    @Override
    public List<AdvertisementModel> findAllByActiveTrue() {
        List<Advertisement> advertisementList = advertisementDao.findAllByActiveTrue();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return advertisementModelList;
    }

    @Override
    public List<AdvertisementModel> findAllByActiveTrueOrderByLastApplicationDate() {
        List<Advertisement> advertisementList = advertisementDao.findAllByActiveTrueOrderByLastApplicationDate();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return advertisementModelList;
    }

    @Override
    public AdvertisementModel updateIsActive(String id, boolean active) throws Exception {
        Optional<Advertisement> advertisementOptional = Optional.of(advertisementDao.findById(UUID.fromString(id)).orElse(null));
        if(!advertisementOptional.isPresent()){
            throw new Exception();
        }
        Advertisement advertisement =   advertisementOptional.get();
        advertisement.setActive(active);
         this.advertisementDao.save(advertisement);
         return advertisementMapper.checkAndConvertToDto(advertisement);
    }

    @Override
    public List<AdvertisementModel> findAllByCompanyName(String companyName) {
        List<Advertisement> advertisementList = advertisementDao.findAllByCompanyName(companyName);
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement: advertisementList
             ) {
         advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return advertisementModelList;
    }
}





