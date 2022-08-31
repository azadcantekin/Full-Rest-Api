package kodlama.io.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import kodlama.io.hrms.service.mapper.AdvertisementMapper;
import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.AdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.repo.AdvertisementRepo;

import kodlama.io.hrms.entities.concretes.Advertisement;


@Service
public class AdvertisementImpl implements AdvertisementService {


    private final AdvertisementRepo advertisementRepo;
    private final AdvertisementMapper advertisementMapper;

    @Autowired
    public AdvertisementImpl(AdvertisementRepo advertisementRepo, AdvertisementMapper advertisementMapper) {
        this.advertisementRepo = advertisementRepo;
        this.advertisementMapper = advertisementMapper;
    }


    @Override
    public Result addAdvertisement(AdvertisementModel advertisementModel) {
        Advertisement entity = advertisementMapper.checkAndConvertToEntity(advertisementModel);
        this.advertisementRepo.save(entity);
        return new SuccessResult("Data listelendi");
    }


    @Override
    public DataResult<List<AdvertisementModel>> getAll() {
        List<Advertisement> advertisementList = this.advertisementRepo.findAll();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }

        return new SuccessDataResult<>(advertisementModelList, "Data has been listed");
    }


    @Override
    public List<AdvertisementModel> findAllByActiveTrue() {
        List<Advertisement> advertisementList = advertisementRepo.findAllByActiveTrue();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return advertisementModelList;
    }

    @Override
    public List<AdvertisementModel> findAllByActiveTrueOrderByLastApplicationDate() {
        List<Advertisement> advertisementList = advertisementRepo.findAllByActiveTrueOrderByLastApplicationDate();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return advertisementModelList;
    }

    @Override
    public AdvertisementModel updateIsActive(String id, boolean active) throws Exception {
        Optional<Advertisement> advertisementOptional = Optional.of(advertisementRepo.findById(UUID.fromString(id)).orElse(null));
        if (!advertisementOptional.isPresent()) {
            throw new Exception();
        }
        Advertisement advertisement = advertisementOptional.get();
        advertisement.setActive(active);
        this.advertisementRepo.save(advertisement);
        return advertisementMapper.checkAndConvertToDto(advertisement);
    }

    @Override
    public List<AdvertisementModel> findAllByCompanyName(String companyName) {
        List<Advertisement> advertisementList = advertisementRepo.findAllByCompanyName(companyName);
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList
        ) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return advertisementModelList;
    }
}





