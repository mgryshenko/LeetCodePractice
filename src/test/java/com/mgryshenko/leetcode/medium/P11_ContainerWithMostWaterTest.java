package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P11_ContainerWithMostWaterTest {

    P11_ContainerWithMostWater underTest = new P11_ContainerWithMostWater();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void maxArea(int[] input, int expected) {
        int result = underTest.maxArea(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,8,6,2,5,4,8,3,7}, 49),
                Arguments.of(new int[]{1,1}, 1),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9,10}, 25)
        );
    }
}