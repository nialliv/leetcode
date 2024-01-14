package ru.artemev.leetcode.tasks;

public class RomanDigits {
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        int[] constNum = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbols = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for (int i = 12; num > 0; i--) {
            int div = num / constNum[i];
            num = num % constNum[i];
            while (div != 0) {
                result.append(symbols[i]);
                div--;
            }
        }


        return result.toString();
    }
}
