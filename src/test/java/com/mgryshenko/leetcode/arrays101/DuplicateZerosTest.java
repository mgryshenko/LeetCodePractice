package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {

    DuplicateZeros underTest = new DuplicateZeros();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void duplicateZeros(int[] input, int[] expected) {
        underTest.duplicateZeros(input);
        assertArrayEquals(expected, input);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,0,2,3,0,4,5,0}, new int[]{1,0,0,2,3,0,0,4}),
                Arguments.of(new int[]{8,4,5,0,0,0,0,7}, new int[]{8,4,5,0,0,0,0,0}),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2,3}),
                Arguments.of(new int[]{1,0,0,2,3}, new int[]{1,0,0,0,0}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{0,0}, new int[]{0,0}),
                Arguments.of(new int[]{0,0,0}, new int[]{0,0,0})
        );
    }
}