package ru.artemev.leetcode.tasks.math;

import org.springframework.stereotype.Component;

@Component
public class BinaryAddition {
    public static String solve(int a, int b) {
        return Integer.toBinaryString(a + b);
    }
}
