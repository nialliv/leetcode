package ru.artemev.leetcode.tasks.strings;

import org.springframework.stereotype.Component;

@Component
public class ScoreOfString {


    public static int scoreOfString(String s) {
        int result = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            result += Math.abs(first - second);
        }

        return result;
    }
}
