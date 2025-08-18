package ru.artemev.leetcode.tasks.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TreeSumTest {

    public static Stream<Arguments> threeSumClosestArgs() {
        return Stream.of(
                Arguments.of(new int[]{-1,2,1,-4}, 1, 2),
                Arguments.of(new int[]{0,0,0}, 1, 0)
        );
    }

    @MethodSource("threeSumClosestArgs")
    @ParameterizedTest
    void threeSumClosestTest(int[]  nums, int target, int expected) {
        int actual = TreeSum.threeSumClosest(nums, target);
        assertEquals(expected, actual);
    }
}