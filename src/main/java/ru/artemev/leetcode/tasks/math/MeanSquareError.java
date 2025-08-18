package ru.artemev.leetcode.tasks.math;

public class MeanSquareError {

    /*
    (CodeWars)
    Complete the function that:
        1 - accepts two integer arrays of equal length
        2 - compares the value each member in one array to the corresponding member in the other
        3 - squares the absolute value difference between those two values
        4 - and returns the average of those squared absolute value difference between each member pair.
     */
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
