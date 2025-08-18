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
@Import(ZigzagConversation.class)
class ZigzagConversationTest {

    @Autowired
    private ZigzagConversation zigzagConversation;

    private static Stream<Arguments> convertTestArgs() {
        return Stream.of(
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("A", 1, "A"),
                Arguments.of("ABC", 2, "ACB"),
                Arguments.of("AB", 1, "AB"),
                Arguments.of("Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.",
                        2,
                        "Aaidoeswr,haenme,rtesqecouishtabrateaeaietedrcinwtgnrlloacsoajsmnsoucutoadodiiesplnrmiaodprs,ubroohreunefnttacneedhsmwynihrieto,iheeaalwnefrdutettpntainnwrdvdr.")
        );
    }

    @MethodSource("convertTestArgs")
    @ParameterizedTest
    void convertTest(String input, int numRows, String expected) {
        String actual = zigzagConversation.convert(input, numRows);
        assertEquals(expected, actual);
    }
}