package Enum;

public enum Roles {
    PRINCIPAL("Principal"),
    TEACHER("Teacher"),
    STUDENT("Student"),
    STAFF("Staff"),
    APPLICANT("Applicant"),
    NON_ACADEMIC_STAFF("Non-Academic Staff");

    private String roleName;

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    Roles(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
