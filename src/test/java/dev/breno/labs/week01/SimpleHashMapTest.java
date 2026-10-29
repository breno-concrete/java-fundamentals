package dev.breno.labs.week01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleHashMapTest {

    SimpleHashMap<Integer, Integer> hash = new SimpleHashMap<Integer, Integer>();

    @Test
    void hasToReturnNullWhenKeyDoesNotExist () {

        assertNull(hash.get(1));
    }

    @Test
    void getReturnsValueAfterPut () {
        hash.put(1, 15);

        Integer value = hash.get(1);

        assertEquals(15, value);
    }

    @Test
    void hasToReturnRightValueWhenPutValueWithSameKeys () {
        hash.put(1000, 5);

        hash.put(1000, 7);

        assertEquals(7, hash.get(1000));
        assertEquals(1, hash.getSize());
    }

    @Test
    void hasToAddNodeInTheIndexWhenHaveSameIdx () {
        hash.put(12, 1);
        hash.put(16, 2);
        hash.put(20, 3);

        assertEquals(3, hash.getSize());
        assertEquals(1, hash.get(12));
        assertEquals(2, hash.get(16));
        assertEquals(3, hash.get(20));
    }
}
