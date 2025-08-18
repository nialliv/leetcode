package ru.artemev.leetcode.tasks.algorithms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AvgArrayTest {

    @Test
    void findMaxAverage_WithNegativeTest() {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;

        double expected = 12.75000;
        double actual = AvgArray.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxAverage_OneElementTest() {
        int[] nums = new int[]{5};
        int k = 1;

        double expected = 5.00000;
        double actual = AvgArray.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxAverage_SortedTest() {
        int[] nums = new int[]{0,1,1,3,3};
        int k = 4;

        double expected = 2.00000;
        double actual = AvgArray.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxAverage_JustTest() {
        int[] nums = new int[]{4,0,4,3,3};
        int k = 5;

        double expected = 2.80000;
        double actual = AvgArray.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }
}