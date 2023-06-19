package Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setup() {
        person = new Person("Jane", "Doe", "john.doe@example.com");
    }

    @Test
    public void testGetFirstName() {
        assertEquals("Jane", person.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        person.setFirstName("Jane");

        assertEquals("Jane", person.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Doe", person.getLastName());
    }

    @Test
    public void testSetLastName() {
        person.setLastName("Smith");

        assertEquals("Smith", person.getLastName());
    }

    @Test
    public void testGetEmail() {
        assertEquals("john.doe@example.com", person.getEmail());
    }

    @Test
    public void testSetEmail() {
        person.setEmail("jane.smith@example.com");

        assertEquals("jane.smith@example.com", person.getEmail());
    }
}
