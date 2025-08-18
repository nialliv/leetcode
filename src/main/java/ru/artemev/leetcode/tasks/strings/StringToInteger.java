package ru.artemev.leetcode.tasks.strings;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class StringToInteger {

    public int myAtoi(String s) {
        if (s.isEmpty() || Character.isAlphabetic(s.charAt(0))) {
            return 0;
        }
        char[] result = new char[s.length()];
        int tmp = 0;
        boolean isNegative = false;
        boolean isChapterAlreadySet = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (tmp != 0 || isChapterAlreadySet) {
                    return getResult(isNegative, result);
                }
                continue;
            }
            if (ch == '-' && tmp == 0) {
                if (isChapterAlreadySet) {
                    return 0;
                }
                isNegative = true;
                isChapterAlreadySet = true;
            } else if (ch == '+' && tmp == 0) {
                if (isChapterAlreadySet) {
                    return 0;
                }
                isChapterAlreadySet = true;
            } else if (Character.isAlphabetic(ch)) {
                return getResult(isNegative, result);
            } else if (Character.isDigit(ch)) {
                result[tmp++] = ch;
            } else {
                return getResult(isNegative, result);
            }
        }

        return getResult(isNegative, result);
    }

    private static int getResult(boolean isNegative, char[] result) {
        String trimmed = new String(result).trim();
        if (trimmed.isBlank()) {
            return 0;
        }
        try {
            return isNegative ? Integer.parseInt("-" + trimmed) : Integer.parseInt(trimmed);
        } catch (NumberFormatException e) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

    public int notMyAtoi(String s) {
        Pattern pattern = Pattern.compile("^ *([+-]?\\d+)");
        Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            return 0;
        }
        String numStr = matcher.group(1);
        int i = 0, sign = 1;
        if (numStr.charAt(0) == '-') {
            sign = -1;
            i = 1;
        } else if (numStr.charAt(0) == '+') {
            i = 1;
        }
        long resNum = 0;
        for (; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            resNum = resNum * 10 + (ch - '0');
            if (resNum * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (resNum * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) (resNum * sign);
    }
}
