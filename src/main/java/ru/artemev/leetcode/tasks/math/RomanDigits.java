package ru.artemev.leetcode.tasks.math;

import java.util.Map;

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

    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> m = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        for (int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                result -= m.get(s.charAt(i));
            } else {
                result += m.get(s.charAt(i));
            }
        }

        return result;
    }
}
