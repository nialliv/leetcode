package ru.artemev.leetcode.tasks.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static int minSteps(String s, String t) {
        int result = 0;
        Map<Character, Integer> tmpMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);
            if (!tmpMap.containsKey(charFromS)) {
                tmpMap.put(charFromS, 0);
            } else {
                tmpMap.put(charFromS, tmpMap.get(charFromS) + 1);
            }
            if (!tmpMap.containsKey(charFromT)) {
                tmpMap.put(charFromT, 0);
            } else {
                tmpMap.put(charFromT, tmpMap.get(charFromT) - 1);
            }
        }

        for (int i : tmpMap.values()) {
            result += i;
        }

        return result;
    }
}
