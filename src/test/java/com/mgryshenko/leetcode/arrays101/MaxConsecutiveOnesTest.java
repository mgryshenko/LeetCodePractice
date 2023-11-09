package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes underTest = new MaxConsecutiveOnes();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void findMaxConsecutiveOnes(int[] input, int expected) {
        int result = underTest.findMaxConsecutiveOnes(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,0,1,1,1}, 3),
                Arguments.of(new int[]{1,1,0,1,1,0}, 2),
                Arguments.of(new int[]{1,1,1,1,1,1}, 6),
                Arguments.of(new int[]{0,0,0,0,0,0}, 0),
                Arguments.of(new int[]{0,1,1,1,1,0}, 4),
                Arguments.of(new int[]{0,1,1,1,1,1}, 5),
                Arguments.of(new int[]{1,0,1,1,0,1}, 2)
        );
    }
}