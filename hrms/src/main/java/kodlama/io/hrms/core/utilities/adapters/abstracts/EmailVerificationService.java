package kodlama.io.hrms.core.utilities.adapters.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.Result;

public interface EmailVerificationService {

	Result verification (User user);
}
