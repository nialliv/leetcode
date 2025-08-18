package ru.artemev.leetcode.tasks.algorithms;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@Import(ContainerWithMostWater.class)
class ContainerWithMostWaterTest {

    @Autowired
    private ContainerWithMostWater containerWithMostWater;

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    void maxArea(int[] inputHeight, int expected) {
        assertEquals(expected, containerWithMostWater.maxArea(inputHeight));
    }
}