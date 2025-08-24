package ru.artemev.leetcode.tasks.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxOnesAfterDelete {

    public static int longestSubarray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        int count = 0, ones = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                ones++;
            } else {
                left.put(i, count);
                count = 0;
            }
        }

        if (ones == 0) return 0;
        if (ones == nums.length) return ones - 1;

        count = 0;

        for (int i = nums.length - 1; i != 0; i--) {
            if (nums[i] == 1) {
                count++;
            } else {
                right.put(i, count);
                count = 0;
            }
        }

        int max = count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                Integer countLeft = left.getOrDefault(i, 0);
                Integer countRight = right.getOrDefault(i, 0);
                max = Math.max(max, countLeft + countRight);
            }
        }

        return max;
    }
}
