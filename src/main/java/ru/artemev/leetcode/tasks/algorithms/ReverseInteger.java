package ru.artemev.leetcode.tasks.algorithms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReverseInteger {

    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));
        try {
            if (stringBuilder.charAt(0) == '-') {
                stringBuilder.deleteCharAt(0);
                return Integer.parseInt(stringBuilder.reverse().insert(0, '-').toString());
            }
            return Integer.parseInt(stringBuilder.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
