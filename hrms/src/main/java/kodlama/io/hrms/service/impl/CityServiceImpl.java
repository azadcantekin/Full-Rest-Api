package kodlama.io.hrms.service.impl;

import kodlama.io.hrms.entities.concretes.City;
import kodlama.io.hrms.repo.CityRepo;
import kodlama.io.hrms.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepo cityRepo;

    @Autowired
    public CityServiceImpl(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }

    @Override
    public List<City> getAllCities() {
        return this.cityRepo.findAll();
    }
}
