package ru.artemev.leetcode.tasks;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.artemev.leetcode.tasks.algorithms.ReverseInteger;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@Import(ReverseInteger.class)
class ReverseIntegerTest {

    @Autowired
    private ReverseInteger reverseInteger;

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(1534236469, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    void test(int input, int expected) {
        assertEquals(expected, reverseInteger.reverse(input));
    }
}