package ru.artemev.leetcode.tasks.yandex.easy;

import java.util.Scanner;

public class GreaterThanNeighbors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int result = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int first = Integer.parseInt(array[i - 1]);
            int second = Integer.parseInt(array[i + 1]);
            int current = Integer.parseInt(array[i]);

            if(current > first && current > second) {
                result++;
            }
        }
        System.out.println(result);
    }
}
