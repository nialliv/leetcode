package ru.artemev.leetcode.tasks;

public class MeanSquareError {
    public static double solution(int[] arr1, int[] arr2) {
        double result = 0;
        if (arr1.length != arr2.length) {
            return 0;
        }
        for (int i = 0; i < arr1.length; i++) {
            result += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
        }
        return result / arr1.length;
    }
}
