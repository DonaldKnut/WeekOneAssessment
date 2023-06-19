package SchoolSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicantTest {
    private Applicant applicant;

    @BeforeEach
    public void setup() {
        applicant = new Applicant("John Doe", 25, 12345);
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", applicant.getName());
    }

    @Test
    public void testSetName() {
        applicant.setName("Jane Smith");

        assertEquals("Jane Smith", applicant.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(25, applicant.getAge());
    }

    @Test
    public void testSetAge() {
        applicant.setAge(30);

        assertEquals(30, applicant.getAge());
    }

    @Test
    public void testGetApplicantsId() {
        assertEquals(12345, applicant.getApplicantsId());
    }

    @Test
    public void testSetApplicantsId() {
        applicant.setApplicantsId(54321);

        assertEquals(54321, applicant.getApplicantsId());
    }
}
