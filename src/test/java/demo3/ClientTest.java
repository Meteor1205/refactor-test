package demo3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void run() {
        List<Person> people = List.of(
                new Person(10, 10.0),
                new Person(20, 20.0),
                new Person(30, 30.0)
        );

        String result = Client.run(people);

        assertEquals("youngestAge: 10, totalSalary: 60.0;", result);
    }
}