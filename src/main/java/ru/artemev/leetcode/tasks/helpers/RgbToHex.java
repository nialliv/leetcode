package ru.artemev.leetcode.tasks.helpers;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
//        return String.format("%02X%02X%02X", r,g,b);
        return Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
    }
}
