package ru.artemev.leetcode.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PlayersWithZeroOrOneLosses {
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = List.of(new ArrayList<>(), new ArrayList<>());
        Map<Integer, Integer> matchesResult = new TreeMap<>();

        for (int[] match : matches) {
            for (int j = 0; j < 2; j++) {
                int player = match[j];
                if (j == 0) {
                    matchesResult.put(player, matchesResult.getOrDefault(player, 0));
                }
                if (j == 1) {
                    matchesResult.put(player, matchesResult.getOrDefault(player, 0) + 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : matchesResult.entrySet()) {
            if (entry.getValue() == 0) {
                ans.get(0).add(entry.getKey());
            }
            if (entry.getValue() == 1) {
                ans.get(1).add(entry.getKey());
            }
        }
        return ans;
    }
}
