package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P3_LongestNonRepeatingSubstringTest {

    P3_LongestNonRepeatingSubstring underTest = new P3_LongestNonRepeatingSubstring();

    @ParameterizedTest
    @CsvSource({
            "abcabcbb,3",
            "bbbbb,1",
            "pwwkew,3",
            "au,2"
    })
    void lengthOfLongestSubstring(String input, int expected) {
        int result = underTest.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }
}