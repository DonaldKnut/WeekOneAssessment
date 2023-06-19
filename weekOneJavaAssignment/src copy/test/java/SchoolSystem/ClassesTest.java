package SchoolSystem;

import Employees.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassesTest {
    private Classes classes;
    private Teacher teacher;
    private Student student1;
    private Student student2;

    @BeforeEach
    public void setup() {
        teacher = new Teacher("Emma Thompson", 40, "English", "A1345O");
        student1 = new Student("Jane Doe", 15, "Grade 10");
        student2 = new Student("Mark Johnson", 16, "Grade 11");

        classes = new Classes("Mathematics", teacher);
        classes.addStudent(student1);
        classes.addStudent(student2);
    }

    @Test
    public void testGetClassName() {
        assertEquals("Mathematics", classes.getClassName());
    }

    @Test
    public void testSetClassName() {
        classes.setClassName("Physics");

        assertEquals("Physics", classes.getClassName());
    }

    @Test
    public void testGetStudents() {
        List<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(student1);
        expectedStudents.add(student2);

        assertEquals(expectedStudents, classes.getStudents());
    }

    @Test
    public void testSetStudents() {
        List<Student> newStudents = new ArrayList<>();
        newStudents.add(new Student("Sarah Johnson", 14, "Grade 9"));

        classes.setStudents(newStudents);

        assertEquals(newStudents, classes.getStudents());
    }

    @Test
    public void testGetTeacher() {
        assertEquals(teacher, classes.getTeacher());
    }

    @Test
    public void testSetTeacher() {
        Teacher newTeacher = new Teacher("Emma Thompson", 40, "English", "A1345O");

        classes.setTeacher(newTeacher);

        assertEquals(newTeacher, classes.getTeacher());
    }
}
