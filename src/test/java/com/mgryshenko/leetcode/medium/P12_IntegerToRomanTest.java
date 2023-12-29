package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P12_IntegerToRomanTest {

    P12_IntegerToRoman underTest = new P12_IntegerToRoman();

    @ParameterizedTest
    @CsvSource({
            "3,III",
            "58,LVIII",
            "1994,MCMXCIV",
    })
    void intToRoman(int input, String expected) {
        String result = underTest.intToRoman(input);
        assertEquals(expected, result);
    }
}