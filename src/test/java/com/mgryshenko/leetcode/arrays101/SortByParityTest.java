package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortByParityTest {

    SortByParity underTest = new SortByParity();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void sortArrayByParity(int[] input, int[] expected) {
        underTest.sortArrayByParity(input);
        assertArrayEquals(expected, input);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{3,1,2,4}, new int[]{4,2,1,3}),
                Arguments.of(new int[]{2,1}, new int[]{2,1}),
                Arguments.of(new int[]{1,2}, new int[]{2,1}),
                Arguments.of(new int[]{2,4,6,8}, new int[]{2,4,6,8}),
                Arguments.of(new int[]{1,3,5,7}, new int[]{1,3,5,7}),
                Arguments.of(new int[]{0}, new int[]{0})
        );
    }
}