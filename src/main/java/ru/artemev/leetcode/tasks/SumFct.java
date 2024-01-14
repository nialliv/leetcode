package ru.artemev.leetcode.tasks;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger result = BigInteger.ZERO;
        BigInteger firstFib = BigInteger.ONE;
        BigInteger secondFib = BigInteger.ONE;
        BigInteger tmpFib;
        for (int i = 0; i < n.intValue() + 1; i++) {
            result = result.add(firstFib);
            tmpFib = firstFib.add(secondFib);
            firstFib = secondFib;
            secondFib = tmpFib;
        }
        return result.multiply(BigInteger.valueOf(4));
    }
}
