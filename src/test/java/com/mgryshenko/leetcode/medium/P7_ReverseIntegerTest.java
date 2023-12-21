package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P7_ReverseIntegerTest {

    P7_ReverseInteger underTest = new P7_ReverseInteger();

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "123,321",
            "-123,-321",
            "120,21",
            "2147447412,2147447412",
            "-2147447412,-2147447412",
            "2147483647,0",
            "-2147483648,0",
            "1534236469,0",
            "1563847412,0",
            "1137464807,0",
    })
    void reverse(int input, int expected) {
        int result = underTest.reverse(input);
        assertEquals(expected, result);
    }
}