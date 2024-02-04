package ru.artemev.leetcode.tasks;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int count = 0;


        while (n != 0) {
            if (n % 2 == 0) {
                n -= 2;
                count += 1;
            } else {
                n -= 1;
                count++;
            }
        }


        return count;
    }
}
