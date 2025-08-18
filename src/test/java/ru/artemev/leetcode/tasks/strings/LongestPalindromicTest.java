package ru.artemev.leetcode.tasks.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@Import(LongestPalindromic.class)
class LongestPalindromicTest {

    @Autowired
    private LongestPalindromic longestPalindromic;

    @Test
    void longestPalindrome_test1() {
        String input = "babad";
        String expected = "bab";
        assertEquals(expected, longestPalindromic.longestPalindrome(input));
    }

    @Test
    void longestPalindrome_test2() {
        String input = "cbbd";
        String expected = "bb";
        assertEquals(expected, longestPalindromic.longestPalindrome(input));
    }

    @Test
    void longestPalindrome_test3() {
        String input = "a";
        assertEquals(input, longestPalindromic.longestPalindrome(input));
    }

    @Test
    void longestPalindrome_test4() {
        String input = "bb";
        assertEquals(input, longestPalindromic.longestPalindrome(input));
    }

    @Test
    void longestPalindrome_test5() {
        String input = "ac";
        String expected = "a";
        assertEquals(expected, longestPalindromic.longestPalindrome(input));
    }

    @Test
    void longestPalindrome_test6() {
        String input = "abb";
        String expected = "bb";
        assertEquals(expected, longestPalindromic.longestPalindrome(input));
    }
}