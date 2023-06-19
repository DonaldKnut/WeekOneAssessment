package SchoolSystem;

import Employees.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    @Test
    public void testGetCourseName() {
        Teacher teacher = new Teacher("John Smith", 35, "Math", "Bt6467");
        Course course = new Course("Mathematics", teacher);

        assertEquals("Mathematics", course.getCourseName());
    }

    @Test
    public void testSetCourseName() {
        Teacher teacher = new Teacher("John Smith", 35, "Math", "Bt6467");
        Course course = new Course("Mathematics", teacher);

        course.setCourseName("Physics");

        assertEquals("Physics", course.getCourseName());
    }

    @Test
    public void testGetTeacher() {
        Teacher teacher = new Teacher("John Smith", 35, "Math", "Bt6467");
        Course course = new Course("Mathematics", teacher);

        assertEquals(teacher, course.getTeacher());
    }

    @Test
    public void testSetTeacher() {
        Teacher initialTeacher = new Teacher("John Smith", 35, "Math", "Bt6467");
        Teacher newTeacher = new Teacher("Emma Thompson", 40, "Physics", "F4r4ee");

        Course course = new Course("Mathematics", initialTeacher);

        course.setTeacher(newTeacher);

        assertEquals(newTeacher, course.getTeacher());
    }
}
