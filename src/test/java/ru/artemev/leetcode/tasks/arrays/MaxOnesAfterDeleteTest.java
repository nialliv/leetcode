package ru.artemev.leetcode.tasks.arrays;

import lombok.SneakyThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxOnesAfterDeleteTest {


    @SneakyThrows
    private static Stream<Arguments> testArgs() {
        Properties properties = new Properties();
        InputStream iStream = new ClassPathResource("longArray.properties").getInputStream();
        properties.load(iStream);
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0, 1}, 3),
                Arguments.of(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}, 5),
                Arguments.of(new int[]{1, 1, 1}, 2),
                Arguments.of(new int[]{0, 1, 1, 1, 1, 1}, 5),
                Arguments.of(getIntByProperties(properties, "first"), 25431),
                Arguments.of(getIntByProperties(properties, "second"), 25431)
        );
    }

    private static int[] getIntByProperties(Properties properties, String key) {
        return Arrays.stream(properties.getProperty(key).split(",")).mapToInt(Integer::parseInt).toArray();
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    void longestSubarrayTest(int[] nums, int expected) {
        int actual = MaxOnesAfterDelete.longestSubarray(nums);
        assertEquals(expected, actual);
    }
}