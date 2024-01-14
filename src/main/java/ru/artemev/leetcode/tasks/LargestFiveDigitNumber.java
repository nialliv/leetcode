package ru.artemev.leetcode.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LargestFiveDigitNumber {

    public static int solve(final String digits) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i <= digits.length() - 5; i++) {
            int numFiveDigits = Integer.parseInt(digits.substring(i, i + 5));
            sum = Math.max(numFiveDigits, sum);
        }
        return sum; // you code here
    }
}
