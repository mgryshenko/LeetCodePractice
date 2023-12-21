package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P8_StringToIntegerTest {

    P8_StringToInteger underTest = new P8_StringToInteger();

    @ParameterizedTest
    @CsvSource({
            "42,42",
            "   -42,-42",
            "4193 with words,4193",
            "00000-1234abc,0",
            " -1123u3761867,-1123",
            "21474836460,2147483647",
            "  0000000000012345678,12345678",
    })
    void myAtoi(String input, int expected) {
        int result = underTest.myAtoi(input);
        assertEquals(expected, result);
    }
}