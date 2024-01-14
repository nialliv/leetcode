package ru.artemev.leetcode.tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Greed {
    public static int greedy(int[] dice) {
        int result = 0;
        Map<Integer, Integer> diceCounter = new HashMap<>();

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Integer i1 = list.stream()
                .findFirst()
                .orElse(0);

        for (int i : dice) {
            if (!diceCounter.containsKey(i)) {
                diceCounter.put(i, 1);
            } else {
                diceCounter.put(i, diceCounter.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> element : diceCounter.entrySet()) {
            if (element.getValue().equals(3)) {

                if (element.getKey().equals(1)) {
                    result += 1000;
                } else {
                    result += element.getKey() * 100;
                }

            } else {

                if (element.getValue().equals(1)) {

                    if (element.getKey().equals(1)) {
                        result += 100;
                    }
                    if (element.getKey().equals(5)) {
                        result += 50;
                    }

                }
            }
        }
        return result;
    }
}
