package dev.breno.leetcode.arrayshashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void hasToReturnTrueWhenValidAnagram () {

        String a = "breno";
        String b = "renob";

        assertTrue(validAnagram.isAnagram(a, b));

    }

    @Test
    void hasToReturnFalseWhenInvalidAnagram() {
        String a = "breno";
        String b = "rencb";

        assertFalse(validAnagram.isAnagram(a, b));

    }

    @Test
    void hasToReturnFalseWhenDifferentSize() {
        String a = "abacate";
        String b = "abanO";

        assertFalse(validAnagram.isAnagram(a, b));
    }

    @Test
    void hasToReturnFalseWhenDifferentLetters() {
        String a = "aab";
        String b = "abb";

        assertFalse(validAnagram.isAnagram(a, b));

    }

}