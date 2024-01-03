package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P13_RomanToIntegerTest {

    @Test
    void romanToInt() {
    }

    P13_RomanToInteger underTest = new P13_RomanToInteger();

    @ParameterizedTest
    @CsvSource({
            "III,3",
            "LVIII,58",
            "MCMXCIV,1994",
            "MMMCMXCIX,3999",
            "MMMDCCCLXXXVIII,3888",
    })
    void intToRoman(String input, int expected) {
        int result = underTest.romanToInt(input);
        assertEquals(expected, result);
    }
}