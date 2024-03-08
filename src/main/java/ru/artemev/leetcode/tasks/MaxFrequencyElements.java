package ru.artemev.leetcode.tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyElements {
    public static int maxFrequencyElements(int[] nums) {
        int max = 0;
        int count = 0;
        Map<Integer, Integer> countEvenInt = new HashMap<>();
        for(int i : nums) {
            countEvenInt.put(i, countEvenInt.getOrDefault(i, 0) + 1);
        }

        for(int i : countEvenInt.values()) {
            max = Math.max(i, max);
        }

        for(int i : countEvenInt.values()) {
            if(i == max) {
                count += i;
            }
        }
        return count;
    }
}
