package kodlama.io.hrms.core.utilities.adapters;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.domain.JobSeeker;

public interface MernisVerificationService {

	Result verification (JobSeeker jobSeeker);
}
