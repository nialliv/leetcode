package ru.artemev.leetcode.tasks.arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        return map.entrySet()
                .stream()
                .allMatch(entry -> entry.getValue() > 1);
    }
}
