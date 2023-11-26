package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P5_LongestPalindromeSubstringTest {

    P5_LongestPalindromeSubstring underTest = new P5_LongestPalindromeSubstring();

    @ParameterizedTest
    @CsvSource({
//            "babad,bab",
//            "cbbd,bb",
            "ba,b",
            "bb,bb",
            "abb,bb",
            "aba,aba",
            "abcdefedcxy,cdefedc",
            "s,s"
    })
    void longestPalindrome(String input, String expected) {
        String result = underTest.longestPalindrome(input);
        assertEquals(expected, result);
    }
}