package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchingItemsTest {

    SearchingItems underTest = new SearchingItems();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void checkIfExist(int[] input, boolean expected) {
        boolean result = underTest.checkIfExist(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{10,2,5,3}, true),
                Arguments.of(new int[]{3,1,7,11}, false),
                Arguments.of(new int[]{-2,0,10,-19,4,6,-8}, false)
        );
    }
}