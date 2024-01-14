package ru.artemev.leetcode.tasks;

import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {
        List<List<Long>> result = new ArrayList<>();

        for (long value = m; value <= n; value++) {
            long sumDivisors = 0;
            for (long i = 1; i <= value; i++) {
                if (value % i == 0) {
                    sumDivisors += i * i;
                }
            }
            if (Math.sqrt(sumDivisors) % 1 == 0) {
                result.add(List.of(value, sumDivisors));

            }
        }
        return result.toString();
    }
}
