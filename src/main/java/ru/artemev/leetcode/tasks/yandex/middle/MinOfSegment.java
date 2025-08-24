package ru.artemev.leetcode.tasks.yandex.middle;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MinOfSegment {

    public static void getSolution() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] >= nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            stringBuilder.append(nums[deque.peekFirst()]).append("\n");

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] >= nums[i]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }
        stringBuilder.append(nums[deque.peekFirst()]);
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        getSolution();
    }
}
