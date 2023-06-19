package Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffTest {
    private Staff staff;

    @BeforeEach
    public void setup() {
        staff = new Staff("John Doe", 35, "Teacher", "ST001");
    }

    @Test
    public void testGetEmail() {
        staff.setEmail("john.doe@example.com");

        assertEquals("john.doe@example.com", staff.getEmail());
    }

    @Test
    public void testGetLastName() {
        staff.setLastName("Doe");

        assertEquals("Doe", staff.getLastName());
    }

    @Test
    public void testGetFirstName() {
        staff.setFirstName("John");

        assertEquals("John", staff.getFirstName());
    }

    @Test
    public void testGetStaff() {
        staff.setStaff("Admin");

        assertEquals("Admin", staff.getStaff());
    }

    @Test
    public void testGetStaffId() {
        assertEquals("ST001", staff.getStaffId());
    }

    @Test
    public void testSetStaffId() {
        staff.setStaffId("ST002");

        assertEquals("ST002", staff.getStaffId());
    }

    @Test
    public void testGetId() {
        staff.setId(123);

        assertEquals(123, staff.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", staff.getName());
    }

    @Test
    public void testSetName() {
        staff.setName("Jane Smith");

        assertEquals("Jane Smith", staff.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(35, staff.getAge());
    }

    @Test
    public void testSetAge() {
        staff.setAge(40);

        assertEquals(40, staff.getAge());
    }

    @Test
    public void testGetDesignation() {
        assertEquals("Teacher", staff.getDesignation());
    }

    @Test
    public void testSetDesignation() {
        staff.setDesignation("Principal");

        assertEquals("Principal", staff.getDesignation());
    }
}

