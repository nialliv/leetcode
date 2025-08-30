package ru.artemev.leetcode.tasks.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DiagonalTraverseTest {

    public static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }, new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}),
                Arguments.of(new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                }, new int[]{1, 2, 5, 9, 6, 3, 4, 7, 10, 13, 14, 11, 8, 12, 15, 16}),
                Arguments.of(new int[][]{
                        {1, 2},
                        {3, 4}
                }, new int[]{1, 2, 3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    void findDiagonalOrderTest(int[][] matrix, int[] expected) {
        int[] actual = DiagonalTraverse.findDiagonalOrder(matrix);
        assertArrayEquals(expected, actual);
    }
}