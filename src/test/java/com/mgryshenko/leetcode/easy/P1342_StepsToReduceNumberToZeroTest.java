package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P1342_StepsToReduceNumberToZeroTest {

    P1342_StepsToReduceNumberToZero underTest = new P1342_StepsToReduceNumberToZero();

    @ParameterizedTest
    @CsvSource({"14,6","8,4","123,12"})
    void numberOfSteps(int input, int output) {
        int result = underTest.numberOfSteps(input);

        assertEquals(output, result);
    }
}