package ru.artemev.leetcode.tasks.yandex.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Breakers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        if (line.isEmpty()) {
            System.out.println("yes");
            return;
        }

        if (line.length() % 2 != 0) {
            System.out.println("no");
            return;
        }

        Map<Character, Character> mapBreakers = new HashMap<>();
        mapBreakers.put('{', '}');
        mapBreakers.put('[', ']');
        mapBreakers.put('(', ')');


        for (char ch : line.toCharArray()) {
            if (mapBreakers.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || mapBreakers.get(stack.pop()) != ch) {
                    System.out.println("no");
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }

}
