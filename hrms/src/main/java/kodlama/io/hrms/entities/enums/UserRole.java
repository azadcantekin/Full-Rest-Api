package kodlama.io.hrms.entities.enums;


import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {

    ADMIN,
    EMPLOYEE,
    JOB_SEEKER,
    EMPLOYER;


    @Override
    public String getAuthority() {
        return name();
    }
}
