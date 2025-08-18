package ru.artemev.leetcode.tasks.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NumOfStepsToOneTest {


    public static final String POSITIVE_1 = "1101";
    public static final String POSITIVE_2 = "10";
    public static final String POSITIVE_3 = "1111011110000011100000110001011011110010111001010111110001";
    public static final String POSITIVE_4 = "1111110011101010110011100100101110010100101110111010111110110010";
    public static final String NEGATIVE = "1";

    @Test
    void numStepsTest_Positive1() {
        int expect = 6;
        int actual = NumOfStepsToOne.numSteps(POSITIVE_1);
        assertEquals(expect, actual);
    }

    @Test
    void numStepsTest_Positive2() {
        int expect = 1;
        int actual = NumOfStepsToOne.numSteps(POSITIVE_2);
        assertEquals(expect, actual);
    }

    @Test
    void numStepsTest_Positive3() {
        int expect = 85;
        int actual = NumOfStepsToOne.numSteps(POSITIVE_3);
        assertEquals(expect, actual);
    }

    @Test
    void numStepsTest_Positive4() {
        int expect = 89;
        int actual = NumOfStepsToOne.numSteps(POSITIVE_4);
        assertEquals(expect, actual);
    }

    @Test
    void numStepsTest_Negative() {
        int expect = 0;
        int actual = NumOfStepsToOne.numSteps(NEGATIVE);
        assertEquals(expect, actual);
    }

}