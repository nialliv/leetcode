package ru.artemev.leetcode.tasks.strings;

public class CorrectBreaks {
    public static boolean getSolution(String line) {
        int left = 0;
        int right = 0;

        for (char c : line.toCharArray()) {
            if (c == '(') left++;
            if (c == ')') right++;
        }
        return left == right;
    }
}
