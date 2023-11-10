package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberOfDigitsTest {

    EvenNumberOfDigits underTest = new EvenNumberOfDigits();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void findNumbers(int[] input, int expected) {
        int result = underTest.findNumbers(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{12,345,2,6,7896}, 2),
                Arguments.of(new int[]{555,901,482,1771}, 1),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{22}, 1)
        );
    }
}