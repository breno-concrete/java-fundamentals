package dev.breno.leetcode.arrayshashing;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            if (complements.containsKey(nums[i])) {
                return new int[]{complements.get(nums[i]), i};
            }

            int complement = target - nums[i];
            complements.put(complement, i);
        }

        return new int[]{};
    }
}
