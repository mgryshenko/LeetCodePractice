package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightCheckerTest {

    HeightChecker underTest = new HeightChecker();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void heightChecker(int[] input, int expected) {
        int result = underTest.heightChecker(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,4,2,1,3}, 3),
                Arguments.of(new int[]{5,1,2,3,4}, 5),
                Arguments.of(new int[]{1,2,3,4,5}, 0)
        );
    }
}