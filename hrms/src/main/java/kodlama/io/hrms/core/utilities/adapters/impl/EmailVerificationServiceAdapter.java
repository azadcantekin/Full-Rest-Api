package kodlama.io.hrms.core.utilities.adapters.impl;

import kodlama.io.hrms.core.utilities.adapters.EmailVerificationService;
import kodlama.io.hrms.entities.domain.User;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;

public class EmailVerificationServiceAdapter implements EmailVerificationService {

	@Override
	public Result verification(User user) {
		
		return new SuccessResult("Verification mail");
	}

}
