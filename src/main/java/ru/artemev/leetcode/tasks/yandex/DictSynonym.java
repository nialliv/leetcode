package ru.artemev.leetcode.tasks.yandex;

import java.util.Scanner;

public class DictSynonym {

    //without Map
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int countPair = in.nextInt();
        String[] pairs = new String[countPair * 2];

        in.nextLine();
        for (int i = 0; i < countPair * 2; i = i + 2) {
            String[] line = in.nextLine().split(" ");
            pairs[i] = line[0];
            pairs[i + 1] = line[1];
        }

        String find = in.next();

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i].equals(find)) {
                if (i % 2 == 0) {
                    System.out.println(pairs[i + 1]);
                } else {
                    System.out.println(pairs[i - 1]);
                }
                break;
            }
        }

        in.close();
    }

}

