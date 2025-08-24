package ru.artemev.leetcode.tasks.yandex.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Polyglots {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Set<String> allLanguages = new HashSet<>();
        Set<String> commonLanguages = null;

        for (int i = 0; i < n; i++) {
            int langCount = in.nextInt();
            String[] langs = new String[langCount];
            for (int j = 0; j < langCount; j++) {
                langs[j] = in.next();
            }
            Set<String> studentLanguages = new HashSet<>(Arrays.asList(langs));

            allLanguages.addAll(studentLanguages);

            if (i == 0) {
                commonLanguages = new HashSet<>(studentLanguages);
            } else {
                commonLanguages.retainAll(studentLanguages);
            }
        }
        System.out.println(commonLanguages.size() + "\n" + String.join("\n", commonLanguages));
        System.out.println(allLanguages.size() + "\n" + String.join("\n", allLanguages));

        in.close();
    }

}
