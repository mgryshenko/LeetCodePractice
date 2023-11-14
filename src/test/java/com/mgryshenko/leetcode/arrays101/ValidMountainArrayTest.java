package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    ValidMountainArray underTest = new ValidMountainArray();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void validMountainArray(int[] input, boolean expected) {
        boolean result = underTest.validMountainArray(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{2,1}, false),
                Arguments.of(new int[]{3,5,5}, false),
                Arguments.of(new int[]{0,3,2,1}, true),
                Arguments.of(new int[]{0,1,2,3,4,5,6,7,8,9}, false),
                Arguments.of(new int[]{9,8,7,6,5,4,3,2,1,0}, false)
        );
    }
}