package dev.breno.labs.week01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleHashMapBlankTest {

    @Test
    void hasReturnTheNodeInputed () {
        SimpleHashMapBlank<Integer, Integer> hash = new SimpleHashMapBlank<>();

        hash.put(2, 5);
        hash.put(3,7);
        hash.put(3, 9);

        assertEquals(5, hash.get(2));
        assertEquals(9, hash.get(3));
        assertNull(hash.get(4));
        assertEquals(2, hash.getSize());
    }

    @Test
    void hasToReturnTrueValuesWhenSingleBucket (){
        SimpleHashMapBlank<Integer, Integer> hash = new SimpleHashMapBlank<>();

        hash.put(8, 5);
        hash.put(12,7);
        hash.put(12, 99);
        hash.put(16, 9);

        assertEquals(5, hash.get(8));
        assertEquals(99, hash.get(12));
        assertEquals(9, hash.get(16));
        assertEquals(3, hash.getSize());
    }

    @Test
    void hasToResizeIfNeeded () {
        SimpleHashMapBlank<Integer, Integer> hash = new SimpleHashMapBlank<Integer, Integer>();


        hash.put(2, 5);
        hash.put(0,7);
        hash.put(3, 9);
        hash.put(4, 9);
        hash.put(5, 9);

        assertEquals(8, hash.getCapacity());
        assertEquals(5, hash.getSize());
        assertEquals(9, hash.get(3));
        assertEquals(9, hash.get(5));

    }

}