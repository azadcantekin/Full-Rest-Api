package kodlama.io.hrms.core.utilities.adapters.concretes;

import kodlama.io.hrms.entities.concretes.User;
import kodlama.io.hrms.core.utilities.adapters.abstracts.EmailVerificationService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;

public class EmailVerificationServiceAdapter implements EmailVerificationService {

	@Override
	public Result verification(User user) {
		
		return new SuccessResult("Verification mail");
	}

}
