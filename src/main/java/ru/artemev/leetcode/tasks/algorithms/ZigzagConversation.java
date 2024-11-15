package ru.artemev.leetcode.tasks.algorithms;

import org.springframework.stereotype.Component;

@Component
public class ZigzagConversation {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] result = new char[s.length()];
        int pointerResult = 0;
        char[][] data = new char[numRows][s.length()];
        int pointerRow = 0;
        int pointerColumn = 0;
        boolean isVertical = true;

        for (char c : s.toCharArray()) {
            data[pointerRow][pointerColumn] = c;
            if (isVertical) {
                if (pointerRow < numRows - 1) {
                    pointerRow++;
                } else {
                    isVertical = false;
                    pointerColumn++;
                    pointerRow--;
                }
            } else {
                if (pointerRow != 0) {
                    pointerColumn++;
                    pointerRow--;
                } else {
                    isVertical = true;
                    pointerRow++;
                }
            }
        }
        for (char[] row : data) {
            for (char character : row) {
                if (Character.MIN_VALUE != character) {
                    result[pointerResult++] = character;
                }
            }
        }
        return new String(result);
    }
}
