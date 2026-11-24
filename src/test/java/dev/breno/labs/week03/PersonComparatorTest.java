package dev.breno.labs.week03;

import dev.breno.labs.week02.Person;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonComparatorTest {

    @Test
    void hasToReturnTheYoungestFirst() {

        List<Person> persons = new ArrayList<>(List.of(

                new Person("Ana", 23),
                new Person("Brandon", 32),
                new Person("Carlos", 20)

        ));

        persons.sort(Comparator.comparingInt(Person::getAge));
        assertEquals("Carlos", persons.getFirst().getName());
        assertEquals("Ana", persons.get(1).getName());
        assertEquals("Brandon", persons.get(2).getName());

    }

    @Test
    void hasToBreaksTheTieByName() {
        List<Person> persons = new ArrayList<>(List.of(

                new Person("Brandon", 23),
                new Person("Ana", 23),
                new Person("Carlos", 20)

        ));

        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        assertEquals("Carlos", persons.getFirst().getName());
        assertEquals("Ana", persons.get(1).getName());
        assertEquals("Brandon", persons.get(2).getName());
    }

    @Test
    void hasToReturnTheRightReversedList() {

        List<Person> personsReverseFirst = new ArrayList<>(List.of(

                new Person("Carlos", 20),
                new Person("Ana", 23),
                new Person("Brandon", 23)

        ));

        List<Person> personsReverseSecond = new ArrayList<>(List.of(
                new Person("Ana", 23),
                new Person("Brandon", 23),
                new Person("Carlos", 20)
        ));

        personsReverseFirst.sort(Comparator.comparingInt(Person::getAge).reversed().thenComparing(Person::getName));

        personsReverseSecond.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName).reversed());

        assertEquals("Ana", personsReverseFirst.getFirst().getName());
        assertEquals("Brandon", personsReverseFirst.get(1).getName());
        assertEquals("Carlos", personsReverseFirst.get(2).getName());


        assertEquals("Brandon", personsReverseSecond.getFirst().getName());
        assertEquals("Ana", personsReverseSecond.get(1).getName());
        assertEquals("Carlos", personsReverseSecond.get(2).getName());

    }

    @Test
    void hasToOverridePersonWithSameAge() {

        TreeSet<Person> personsSet = new TreeSet<>(Comparator.comparingInt(Person::getAge));

        personsSet.add(new Person("Ana", 30));
        personsSet.add(new Person("Bianca", 30));

        assertEquals(1, personsSet.size());
        assertEquals("Ana", personsSet.getFirst().getName());
    }

}