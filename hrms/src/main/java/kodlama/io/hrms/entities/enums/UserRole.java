package kodlama.io.hrms.entities.enums;

public enum UserRole {

    ADMIN("ADMIN"),
    EMPLOYEE("EMPLOYEE"),
    JOB_SEEKER("JOB_SEEKER"),
    EMPLOYER("EMPLOYER");

    private String role;

    UserRole(String role) {
        this.role = role;
    }
}
