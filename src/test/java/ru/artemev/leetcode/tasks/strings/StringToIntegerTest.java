package ru.artemev.leetcode.tasks.strings;

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
@Import(StringToInteger.class)
class StringToIntegerTest {

    @Autowired
    private StringToInteger stringToInteger;

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of(" -042", -42),
                Arguments.of("1337c0d3", 1337),
                Arguments.of("0-1", 0),
                Arguments.of("words and 987", 0),
                Arguments.of("4193 with words", 4193),
                Arguments.of(".1", 0),
                Arguments.of(".0", 0),
                Arguments.of("+-12", 0),
                Arguments.of("   +0 123", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testArgs")
    void myAtoi(String input, int expected) {
        assertEquals(expected, stringToInteger.myAtoi(input));
    }
}