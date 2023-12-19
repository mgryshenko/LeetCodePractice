package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P6_ZigZagConversionTest {

    P6_ZigZagConversion underTest = new P6_ZigZagConversion();

    @ParameterizedTest
    @CsvSource({
            "PAYPALISHIRING,3,PAHNAPLSIIGYIR",
            "PAYPALISHIRING,4,PINALSIGYAHRPI",
            "ABCDEFG,2,ACEGBDF",
            "ABCDE,4,ABCED",
            "A,1,A"
    })
    void convert(String input, int inputNumRows, String expected) {
        String result = underTest.convert(input, inputNumRows);
        assertEquals(expected, result);
    }
}