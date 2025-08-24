package ru.artemev.leetcode.tasks.yandex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import ru.artemev.leetcode.tasks.yandex.middle.MinOfSegment;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class MinOfSegmentTest {

    public static Stream<Arguments> getSolutionArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 4, 5, 3, 1}, 3, new int[]{1, 2, 2, 3, 1}),
                Arguments.of(new int[]{1, 3, 2, 4, 5, 3, 1}, 1, new int[]{1, 3, 2, 4, 5, 3, 1}),
                Arguments.of(new int[]{1, -3, 2, 4, -5, 3, 1}, 4, new int[]{-3, -5, -5, -5}),
                Arguments.of(new int[]{1, -3, 2}, 2, new int[]{-3, -3}),
                Arguments.of(new int[]{1, 4, 2}, 2, new int[]{1, 2})
        );

    }

    @ParameterizedTest
    @MethodSource("getSolutionArgs")
    void getSolutionTest(int[] nums, int k, int[] expected) {
        int[] actual = MinOfSegment.getSolution(nums, k);
        assertArrayEquals(expected, actual);
    }
}