package ru.artemev.leetcode.tasks.math;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String xOfString = Integer.toString(x);
        for (int i = 0; i < xOfString.length() / 2; i++) {
            if (xOfString.charAt(i) != xOfString.charAt(xOfString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
