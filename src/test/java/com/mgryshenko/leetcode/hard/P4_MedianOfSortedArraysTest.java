package com.mgryshenko.leetcode.hard;

import com.mgryshenko.leetcode.hard.P4_MedianOfSortedArrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P4_MedianOfSortedArraysTest {

    P4_MedianOfSortedArrays underTest = new P4_MedianOfSortedArrays();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void findMedianSortedArrays(int[] input1, int[] input2, double expected) {
        double result = underTest.findMedianSortedArrays(input1, input2);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1}, new int[]{2,3}, 2.0d),
                Arguments.of(new int[]{0,0,0,0,0}, new int[]{-1,0,0,0,0,0,1}, 0.0d),
                Arguments.of(new int[]{1,3}, new int[]{2}, 2.0d),
                Arguments.of(new int[]{1}, new int[]{1}, 1.0d),
                Arguments.of(new int[]{1}, new int[]{3}, 2.0d),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2,4,5}, 2.0d),
                Arguments.of(new int[]{1,2,3}, new int[]{1,2,4,5,6}, 2.5d),
                Arguments.of(new int[]{1,2,3}, new int[]{}, 2.0d),
                Arguments.of(new int[]{}, new int[]{1,2,4,5,6}, 4.0d),
                Arguments.of(new int[]{1,2}, new int[]{3,4}, 2.5d)
        );
    }
}