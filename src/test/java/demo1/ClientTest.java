package demo1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTest {

    @Test
    void run() {
        Person person = new Person("T");

        Client.run(person);

        assertEquals(List.of(new Course("a", false),
                new Course("b", false),
                new Course("c", false),
                new Course("d", false)), person.getCourses());
    }
}