package SchoolSystem;

import java.util.ArrayList;
import java.util.List;
import Entity.Person;

public class Student extends Person {
    private static String firstName;

    private static String lastName;

    private static String email;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        Student.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Student.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Student.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    private String name;
    private  int age;
    private String grade;
    private List<Course> courses;

    public Student(String name, int age, String grade) {
        super(firstName, lastName, email);
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

}
