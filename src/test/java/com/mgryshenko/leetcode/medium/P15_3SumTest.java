package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class P15_3SumTest {

    @Test
    void threeSum() {
    }

    P15_3Sum underTest = new P15_3Sum();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void threeSum(int[] input, List<List<Integer>> expected) {
        List<List<Integer>> result = underTest.threeSum(input);
        assertIterableEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{0,1,1}, List.of()),
                Arguments.of(new int[]{-1,0,1,2,-1,-4}, List.of(List.of(1,0,-1),List.of(2,-1,-1))),
                Arguments.of(new int[]{0,0,0}, List.of(List.of(0,0,0)))
        );
    }
}