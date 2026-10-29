package dev.breno.leetcode.arrayshashing;

import java.util.LinkedHashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> vistos = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (vistos.containsKey(nums[i])) {

                return new int[]{vistos.get(nums[i]), i};

            }
            vistos.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
