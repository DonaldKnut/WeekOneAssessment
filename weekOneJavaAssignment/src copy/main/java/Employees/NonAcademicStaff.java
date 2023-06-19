package Employees;

import Entity.Staff;

public class NonAcademicStaff extends Staff {
    private String staffId;
    private String department;

    public NonAcademicStaff(String name, int age, String designation, String staffId) {
        super(name, age, designation, staffId);
        this.staffId = staffId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

}

