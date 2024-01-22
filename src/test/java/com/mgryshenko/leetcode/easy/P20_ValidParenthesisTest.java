package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P20_ValidParenthesisTest {

    P20_ValidParenthesis underTest = new P20_ValidParenthesis();

    @ParameterizedTest
    @CsvSource({
            "(),true",
            "()[]{},true",
            "(],false",
            "([)],false",
            "],false",
    })
    void isValid(String input, boolean expected) {
        boolean result = underTest.isValid(input);
        assertEquals(expected, result);
    }
}