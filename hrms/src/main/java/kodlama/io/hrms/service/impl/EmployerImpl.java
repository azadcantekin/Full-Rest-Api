package kodlama.io.hrms.service.impl;

import java.util.List;

import kodlama.io.hrms.entities.dto.EmployerModel;
import kodlama.io.hrms.service.mapper.EmployerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.service.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.repo.EmployerRepo;
import kodlama.io.hrms.entities.concretes.Employer;

import javax.annotation.Resource;

@Service
public class EmployerImpl implements EmployerService {


    private final EmployerRepo employerRepo;
    private final EmployerMapper mapper;

    @Autowired
    public EmployerImpl(EmployerRepo employerRepo, EmployerMapper mapper) {
        this.employerRepo = employerRepo;
        this.mapper = mapper;
    }

    @Override
    public DataResult<List<Employer>> getAll() {

        return new SuccessDataResult<List<Employer>>(this.employerRepo.findAll(), "All Employers has been listed .");
    }

    @Override
    public Result add(EmployerModel employerModel) {
        this.employerRepo.save(mapper.checkAndConvertToEntity(employerModel));
        return new SuccessResult("Employer has been added .");
    }


}
