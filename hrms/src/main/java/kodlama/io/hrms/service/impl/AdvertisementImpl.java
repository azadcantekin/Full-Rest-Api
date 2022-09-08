package kodlama.io.hrms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.service.mapper.AdvertisementMapper;
import kodlama.io.hrms.entities.dto.AdvertisementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.AdvertisementService;
import kodlama.io.hrms.repo.AdvertisementRepo;

import kodlama.io.hrms.entities.domain.Advertisement;


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
        List<Advertisement> advertisementList = advertisementRepo.findAll();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }

        return new SuccessDataResult<>(advertisementModelList, "Data has been listed");
    }


    @Override
    public DataResult<List<AdvertisementModel>> findAllByActiveTrue() {
        List<Advertisement> advertisementList = advertisementRepo.findAllByActiveTrue();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return new SuccessDataResult<>(advertisementModelList);
    }

    @Override
    public DataResult<List<AdvertisementModel>> findAllByActiveTrueOrderByLastApplicationDate() {
        List<Advertisement> advertisementList = advertisementRepo.findAllByActiveTrueOrderByLastApplicationDate();
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return new SuccessDataResult<>(advertisementModelList);
    }

    @Override
    public DataResult<AdvertisementModel> updateIsActive(String id, boolean active) throws Exception {
        Optional<Advertisement> advertisementOptional = Optional.of(advertisementRepo.findById(UUID.fromString(id)).orElse(null));
        if (!advertisementOptional.isPresent()) {
            throw new Exception();
        }
        Advertisement advertisement = advertisementOptional.get();
        advertisement.setActive(active);
        advertisementRepo.save(advertisement);
        AdvertisementModel advertisementModel = advertisementMapper.checkAndConvertToDto(advertisement);
        return new SuccessDataResult<>(advertisementModel);
    }

    @Override
    public DataResult<List<AdvertisementModel>> findAllByCompanyName(String companyName) {
        List<Advertisement> advertisementList = advertisementRepo.findAllByCompanyName(companyName);
        List<AdvertisementModel> advertisementModelList = new ArrayList<>();
        for (Advertisement advertisement : advertisementList
        ) {
            advertisementModelList.add(advertisementMapper.checkAndConvertToDto(advertisement));
        }
        return new SuccessDataResult<>(advertisementModelList);
    }
}





