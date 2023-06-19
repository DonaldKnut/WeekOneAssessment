package Employees;

import Entity.Staff;

public class Teacher extends Staff {
    private static String designation;
    private String teacherId;
    private String subject;

    public Teacher(String name, int age, String subject, String teacherId) {
        super(name, age, designation);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public void setDesignation(String designation) {
        Teacher.designation = designation;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void teachCourse(String courseName) {
        System.out.println(getName() + " is teaching " + courseName + " in " + getSubject());
    }

    public void displayInformation() {
//        super.displayInformation();
        System.out.println("Subject: " + subject);
    }
}

