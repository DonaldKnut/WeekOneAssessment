package Employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {
    @Test
    public void testGetDesignation() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");

        assertEquals("Teacher", teacher.getDesignation());
    }

    @Test
    public void testSetDesignation() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");
        teacher.setDesignation("Teacher");

        assertEquals("Teacher", teacher.getDesignation());
    }

    @Test
    public void testGetSubject() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");

        assertEquals("Math", teacher.getSubject());
    }

    @Test
    public void testSetSubject() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");
        teacher.setSubject("Science");

        assertEquals("Science", teacher.getSubject());
    }

    @Test
    public void testGetTeacherId() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");

        assertEquals("T001", teacher.getTeacherId());
    }

    @Test
    public void testSetTeacherId() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");
        teacher.setTeacherId("T002");

        assertEquals("T002", teacher.getTeacherId());
    }

    @Test
    public void testTeachCourse() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");
        String courseName = "Algebra";

        teacher.teachCourse(courseName);
        // The teachCourse method just prints a message, so there is no assertion to check.
        // You can manually verify if the message is printed correctly during test execution.
    }

    @Test
    public void testDisplayInformation() {
        Teacher teacher = new Teacher("John Doe", 35, "Math", "T001");

        teacher.displayInformation();
        // The displayInformation method just prints information, so there is no assertion to check.
        // You can manually verify if the information is printed correctly during test execution.
    }
}
