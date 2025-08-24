package ru.artemev.leetcode.tasks.yandex.easy;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
