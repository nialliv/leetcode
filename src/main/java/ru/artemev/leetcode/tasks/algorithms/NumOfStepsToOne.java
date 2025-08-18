package ru.artemev.leetcode.tasks.algorithms;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.ZERO;

@Component
public class NumOfStepsToOne {

    public static int numSteps(String binaryByString) {
        BigInteger decimalDigit = new BigInteger(binaryByString, 2);
        if (ONE.equals(decimalDigit) || ZERO.equals(decimalDigit)) {
            return 0;
        }

        int count = 0;
        while (!ONE.equals(decimalDigit)) {

            if (decimalDigit.mod(TWO).equals(ZERO)) {
                decimalDigit = decimalDigit.divide(TWO);
            } else {
                decimalDigit = decimalDigit.add(ONE);
            }
            count++;
        }

        return count;
    }


}
