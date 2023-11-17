package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReplaceWithGreatestOnRightSideTest {

    ReplaceWithGreatestOnRightSide underTest = new ReplaceWithGreatestOnRightSide();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void replaceElements(int[] input, int[] expected) {
        int[] result = underTest.replaceElements(input);
        assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{17,18,5,4,6,1}, new int[]{18,6,6,6,1,-1}),
                Arguments.of(new int[]{5,6,7,8,9}, new int[]{9,9,9,9,-1}),
                Arguments.of(new int[]{5,6}, new int[]{6,-1}),
                Arguments.of(new int[]{9,8,7,6,5}, new int[]{8,7,6,5,-1}),
                Arguments.of(new int[]{9,8}, new int[]{8,-1}),
                Arguments.of(new int[]{400}, new int[]{-1})
        );
    }
}