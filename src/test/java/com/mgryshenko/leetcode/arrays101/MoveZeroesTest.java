package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    MoveZeroes underTest = new MoveZeroes();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void moveZeroes(int[] input, int[] expected) {
        underTest.moveZeroes(input);
        assertArrayEquals(expected, input);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{0,1,0,3,12}, new int[]{1,3,12,0,0}),
                Arguments.of(new int[]{0,1}, new int[]{1,0}),
                Arguments.of(new int[]{0,0}, new int[]{0,0}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }
}