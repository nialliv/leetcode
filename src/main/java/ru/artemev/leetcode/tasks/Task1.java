package ru.artemev.leetcode.tasks;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Task1 {

    public static void run(String string) {

        int bestResult = 0;
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (!characters.contains(currentChar)) {
                characters.add(currentChar);
            } else {

                if (characters.size() > bestResult) {
                    bestResult = characters.size();
                }
                characters.clear();
            }
        }
        System.out.println("Result = " + bestResult);
    }

    public static int runNotMySolution(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }
}
