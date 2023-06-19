package Employees;

import Entity.Staff;

public class Principal extends Staff {
    private String gradeLevel;
    private String name;
    private int age;
    private String department;

    public Principal(String name, int age, String designation,String gradeLevel, String staffId) {
        super(name, age, designation, staffId);
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
        this.staff = staffId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void announce(String message) {
        System.out.println("Announcement from the Principal: " + message);
    }
}
