package dev.breno.leetcode.arrayshashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void hasToReturnFalseWhenNonDuplicateItem () {
        int[] nonRepetitiveNums = new int[]{1,2,3,4,5};


        assertFalse(containsDuplicate.containsDuplicate(nonRepetitiveNums));
    }

    @Test
    void hasToReturnTrueWhenDuplicateItem () {
        int[] repetitiveNums = new int[]{1,2,3,2,3};


        assertTrue(containsDuplicate.containsDuplicate(repetitiveNums));
    }

    @Test
    void hasToReturnFalseWhenEmptyArray () {
        int[] emptyArray = new int[]{};

        assertFalse(containsDuplicate.containsDuplicate(emptyArray));
    }



}
