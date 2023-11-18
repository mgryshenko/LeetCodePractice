package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P1_TwoSumsTest {

    P1_TwoSums underTest = new P1_TwoSums();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void twoSum(int[] inputNums, int inputTarget, int[] expected) {
        int[] result = underTest.twoSum(inputNums, inputTarget);
        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of(new int[]{0,4,3,0}, 0, new int[]{0,3}),
                Arguments.of(new int[]{-1,-2,-3,-4,-5}, -8, new int[]{2,4}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1})
        );
    }
}