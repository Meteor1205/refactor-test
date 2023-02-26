package demo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getPhoneNumber() {
        Person person = new Person();
        person.setOfficeNumber("def");
        person.setOfficeAreaCode("abc");

        assertEquals("abc def", person.getTelephoneNumber());
    }
}