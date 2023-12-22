package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P9_PalindromeNumberTest {

    @Test
    void isPalindrome() {
    }

    P9_PalindromeNumber underTest = new P9_PalindromeNumber();

    @ParameterizedTest
    @CsvSource({
            "121,true",
            "1231,false",
            "1221,true",
            "12321,true",
            "-121,false",
            "10,false",
            "1,true",
    })
    void isPalindrome(int input, boolean expected) {
        boolean result = underTest.isPalindrome(input);
        assertEquals(expected, result);
    }
}