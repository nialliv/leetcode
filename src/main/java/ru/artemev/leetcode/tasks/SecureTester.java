package ru.artemev.leetcode.tasks;

import java.util.regex.Pattern;

public class SecureTester {
    public static boolean alphanumeric(String s) {
        return Pattern.matches("\\p{Alnum}+", s);
    }
}
