package Employees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrincipalTest {
    @Test
    public void testGetDepartment() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");
        principal.setDepartment("Administration");

        assertEquals("Administration", principal.getDepartment());
    }

    @Test
    public void testSetDepartment() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");
        principal.setDepartment("Administration");

        assertEquals("Administration", principal.getDepartment());
    }

    @Test
    public void testGetGradeLevel() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");

        assertEquals("High School", principal.getGradeLevel());
    }

    @Test
    public void testSetGradeLevel() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");
        principal.setGradeLevel("Middle School");

        assertEquals("Middle School", principal.getGradeLevel());
    }

    @Test
    public void testGetName() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");

        assertEquals("John Smith", principal.getName());
    }

    @Test
    public void testSetName() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");
        principal.setName("Jane Doe");

        assertEquals("Jane Doe", principal.getName());
    }

    @Test
    public void testGetAge() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");

        assertEquals(45, principal.getAge());
    }

    @Test
    public void testSetAge() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");
        principal.setAge(50);

        assertEquals(50, principal.getAge());
    }

    @Test
    public void testAnnounce() {
        Principal principal = new Principal("John Smith", 45, "Principal", "High School", "P001");
        String message = "Please attend the school assembly tomorrow.";

        principal.announce(message);
        // The announce method just prints the message, so there is no assertion to check.
        // You can manually verify if the message is printed correctly during test execution.
    }
}
