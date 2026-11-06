package dev.breno.labs.week02;

import dev.breno.labs.week01.SimpleHashMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getReturnsNullAfterKeyNameChanges() {
        SimpleHashMap<Person, Integer> map = new SimpleHashMap<>();
        Person person = new Person("Ana", 12);

        map.put(person, 1);
        person.setName("Bia");

        assertNull(map.get(person));
        assertNull(map.get(new Person("Ana", 12)));
        assertEquals(1, map.getSize());
    }

}