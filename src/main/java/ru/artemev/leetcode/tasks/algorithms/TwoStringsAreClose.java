package ru.artemev.leetcode.tasks.algorithms;

import java.util.Arrays;

public class TwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        int[] arrayOfWord1 = new int[26];
        int[] arrayOfWord2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            arrayOfWord1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            arrayOfWord2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((arrayOfWord1[i] > 0 && arrayOfWord2[i] == 0) || (arrayOfWord2[i] > 0 && arrayOfWord1[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(arrayOfWord1);
        Arrays.sort(arrayOfWord2);

        for (int i = 0; i < 26; i++) {
            if (arrayOfWord1[i] != arrayOfWord2[i]) {
                return false;
            }
        }
        return true;
    }
}
