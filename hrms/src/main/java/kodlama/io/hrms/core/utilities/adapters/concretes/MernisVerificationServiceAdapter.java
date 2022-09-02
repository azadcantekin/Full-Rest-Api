package kodlama.io.hrms.core.utilities.adapters.concretes;

import kodlama.io.hrms.core.utilities.adapters.abstracts.MernisVerificationService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.domain.JobSeeker;

public class MernisVerificationServiceAdapter implements MernisVerificationService{

	@Override
	public Result verification(JobSeeker jobSeeker) {
		
		return new SuccessResult("Mernis verification");
	}

}
