package ru.artemev.leetcode.tasks.strings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ScoreOfStringTest {

    @Test
    void scoreOfString_Test1() {
        assertEquals(13, ScoreOfString.scoreOfString("hello"));
    }

    @Test
    void scoreOfString_Test2() {
        assertEquals(50, ScoreOfString.scoreOfString("zaz"));
    }

    @Test
    void scoreOfString_Test3() {
        assertEquals(25, ScoreOfString.scoreOfString("za"));
    }
}