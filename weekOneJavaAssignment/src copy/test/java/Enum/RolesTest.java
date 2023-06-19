package Enum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RolesTest {
    @Test
    public void testGetRoleName() {
        assertEquals("Principal", Roles.PRINCIPAL.getRoleName());
        assertEquals("Teacher", Roles.TEACHER.getRoleName());
        assertEquals("Student", Roles.STUDENT.getRoleName());
        assertEquals("Staff", Roles.STAFF.getRoleName());
        assertEquals("Applicant", Roles.APPLICANT.getRoleName());
        assertEquals("Non-Academic Staff", Roles.NON_ACADEMIC_STAFF.getRoleName());
    }

    @Test
    public void testSetRoleName() {
        Roles.PRINCIPAL.setRoleName("Principal");
        assertEquals("Principal", Roles.PRINCIPAL.getRoleName());

        Roles.TEACHER.setRoleName("Teacher");
        assertEquals("Teacher", Roles.TEACHER.getRoleName());

        Roles.STUDENT.setRoleName("Student");
        assertEquals("Student", Roles.STUDENT.getRoleName());

        Roles.STAFF.setRoleName("Staff");
        assertEquals("Staff", Roles.STAFF.getRoleName());

        Roles.APPLICANT.setRoleName("Applicant");
        assertEquals("Applicant", Roles.APPLICANT.getRoleName());

        Roles.NON_ACADEMIC_STAFF.setRoleName("Non-Academic Staff");
        assertEquals("Non-Academic Staff", Roles.NON_ACADEMIC_STAFF.getRoleName());
    }
}
