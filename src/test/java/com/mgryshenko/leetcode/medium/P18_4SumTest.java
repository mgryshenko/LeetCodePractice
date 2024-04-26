package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P18_4SumTest {

    P18_4Sum underTest = new P18_4Sum();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void fourSum(int[] inputNums, int inputTarget, List<List<Integer>> expected) {
        List<List<Integer>> result = underTest.fourSum(inputNums, inputTarget);
        assertIterableEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,0,-1,0,-2,2}, 0, List.of(List.of(-2,0,0,2),List.of(-2,-1,1,2),List.of(-1,0,0,1))),
                Arguments.of(new int[]{2,2,2,2,2}, 8, List.of(List.of(2,2,2,2))),
                Arguments.of(new int[]{0,0,0,0}, 0, List.of(List.of(0,0,0,0))),
                Arguments.of(new int[]{-3,-1,0,2,4,5}, 0, List.of(List.of(-3,-1,0,4))),
                Arguments.of(new int[]{-2,-1,-1,1,1,2,2}, 0, List.of(List.of(-2,-1,1,2),List.of(-1,-1,1,1))),
                Arguments.of(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296, List.of())
        );
    }
}