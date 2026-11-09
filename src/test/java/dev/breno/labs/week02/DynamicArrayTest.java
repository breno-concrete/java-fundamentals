package dev.breno.labs.week02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    DynamicArray dynamicArray = new DynamicArray();

    @Test
    void sizeIsTwoAfterTwoAdds() {
        dynamicArray.add(2);
        dynamicArray.add(4);

        assertEquals(2, dynamicArray.size());
    }

    @Test
    void hasToReturnZeroSizeWhenEmpty() {
        assertEquals(0,dynamicArray.size());
    }

    @Test
    void hasToReturnTheUniqueValueAdded() {
        dynamicArray.add(5);

        assertEquals(5, dynamicArray.get(0));
    }

    @Test
    void hasToReturnThreeValuesWhenAdded() {
        dynamicArray.add(9);
        dynamicArray.add(8);
        dynamicArray.add(7);

        assertEquals(9, dynamicArray.get(0));
        assertEquals(8, dynamicArray.get(1));
        assertEquals(7, dynamicArray.get(2));
    }

    @Test
    void hasToReturnRightGetsWhenAdds100Elements() {
        for(int i = 0; i < 100; i++) {
            dynamicArray.add(i * 10);
        }

        for(int j = 0; j<100; j++) {
            assertEquals(j * 10, dynamicArray.get(j));
        }

        assertEquals(100, dynamicArray.size());
    }

}