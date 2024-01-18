package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P2423_RemoveLetterToEqualizeFreqTest {

    P2423_RemoveLetterToEqualizeFreq underTest = new P2423_RemoveLetterToEqualizeFreq();

    @ParameterizedTest
    @CsvSource({
            "abcc,true"
            , "aacc,false"
            , "bac,true"
            , "aca,true"
            , "cbbd,true"
            , "abbcc,true"
            , "abbbccc,true"
            , "zz,true"
    })
    void numberOfSteps(String input, boolean expected) {
        boolean result = underTest.equalFrequency(input);
        assertEquals(expected, result);
    }
}