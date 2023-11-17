package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdMaximumNumberTest {

    ThirdMaximumNumber underTest = new ThirdMaximumNumber();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void thirdMax(int[] input, int expected) {
        int result = underTest.thirdMax(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, 2),
                Arguments.of(new int[]{3,2,1}, 1),
                Arguments.of(new int[]{1,2,-3}, -3),
                Arguments.of(new int[]{1,2}, 2),
                Arguments.of(new int[]{2,2,3,1}, 1),
                Arguments.of(new int[]{2,2,3,1,5,0,-1,7,10}, 5)
        );
    }
}