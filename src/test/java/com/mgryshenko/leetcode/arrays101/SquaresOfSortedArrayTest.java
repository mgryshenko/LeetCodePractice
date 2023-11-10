package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

    SquaresOfSortedArray underTest = new SquaresOfSortedArray();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void sortedSquares(int[] input, int[] expected) {
        int[] result = underTest.sortedSquares(input);
        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{-4,-1,0,3,10}, new int[]{0,1,9,16,100}),
                Arguments.of(new int[]{-7,-3,2,3,11}, new int[]{4,9,9,49,121}),
                Arguments.of(new int[]{-2,-2,-2,2,2,2}, new int[]{4,4,4,4,4,4}),
                Arguments.of(new int[]{-2,-2,0,1,2,3}, new int[]{0,1,4,4,4,9}),
                Arguments.of(new int[]{-2,-2,-1,0,2}, new int[]{0,1,4,4,4})
        );
    }
}