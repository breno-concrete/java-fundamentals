package dev.breno.leetcode.arrayshashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {


    TwoSum twoSum = new TwoSum();


    @Test
    void deveRetornarIndicesDeNumerosIguaisQuandoNumerosRepetirem() {
        int[] nums = {2, 3, 3};

        int target = 6;

        int[] expected = {1, 2};
        int[] result = twoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);

    }

    @Test
    void deveRetornarIndicesDeNumerosQuandoNumerosForemDiferentes() {
        int[] nums = {2, 3, 4};

        int target = 6;

        int[] expected = {0, 2};
        int[] result = twoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void deveRetornarIndicesDeNumerosQuandoNumerosSomadosCoincidemComOTarget() {

        int[] nums = {2, 7, 9, 23, 1};

        int target = 24;

        int[] expected = {3, 4};
        int[] result = twoSum.twoSum(nums, target);

        assertArrayEquals(expected, result);

    }


}
