package kodlama.io.hrms.core.utilities.adapters;

import kodlama.io.hrms.entities.domain.User;
import kodlama.io.hrms.core.utilities.results.Result;

public interface EmailVerificationService {

	Result verification (User user);
}
