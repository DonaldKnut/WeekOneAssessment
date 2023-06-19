package SchoolSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student("Alice Smith", 15, "10th Grade");
    }

    @Test
    public void testGetFirstName() {
        student.setFirstName("Alice");

        assertEquals("Alice", student.getFirstName());
    }

    @Test
    public void testGetLastName() {
        student.setLastName("Smith");

        assertEquals("Smith", student.getLastName());
    }

    @Test
    public void testGetEmail() {
        student.setEmail("alice@example.com");

        assertEquals("alice@example.com", student.getEmail());
    }

    @Test
    public void testGetName() {
        assertEquals("Alice Smith", student.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(15, student.getAge());
    }

    @Test
    public void testGetGrade() {
        assertEquals("10th Grade", student.getGrade());
    }

    @Test
    public void testGetCourses() {
        List<Course> expectedCourses = new ArrayList<>();
        Course mathCourse = new Course("Mathematics", "lukas gibbs");
        Course scienceCourse = new Course("Science", "lukas gibbs");
        expectedCourses.add(mathCourse);
        expectedCourses.add(scienceCourse);

        student.setCourses(expectedCourses);

        assertEquals(expectedCourses, student.getCourses());
    }

    @Test
    public void testAddCourse() {
        Course mathCourse = new Course("Mathematics", "lukas gibbs");
        Course scienceCourse = new Course("Science", "lukas gibbs");

        student.addCourse(mathCourse);
        student.addCourse(scienceCourse);

        List<Course> expectedCourses = new ArrayList<>();
        expectedCourses.add(mathCourse);
        expectedCourses.add(scienceCourse);

        assertEquals(expectedCourses, student.getCourses());
    }
}
