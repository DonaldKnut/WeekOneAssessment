package Employees;

import Employees.NonAcademicStaff;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonAcademicStaffTest {

    @Test
    public void testNonAcademicStaffInitialization() {
        NonAcademicStaff staff = new NonAcademicStaff("John Doe", 35, "Clerk", "NAC001");

        assertEquals("John Doe", staff.getName());
        assertEquals(35, staff.getAge());
        assertEquals("Clerk", staff.getDesignation());
        assertEquals("NAC001", staff.getStaffId());
        assertEquals(null, staff.getDepartment());
    }

    @Test
    public void testNonAcademicStaffDepartment() {
        NonAcademicStaff staff = new NonAcademicStaff("John Doe", 35, "Clerk", "NAC001");
        staff.setDepartment("Administration");

        assertEquals("Administration", staff.getDepartment());
    }
}
