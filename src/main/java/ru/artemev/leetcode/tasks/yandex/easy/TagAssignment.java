package ru.artemev.leetcode.tasks.yandex.easy;

import java.util.Arrays;
import java.util.Scanner;

public class TagAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println(n);
            return;
        }

        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }

        System.out.println(Arrays.stream(fib).sum());
    }

}
