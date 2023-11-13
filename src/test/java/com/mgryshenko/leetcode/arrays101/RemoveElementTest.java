package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement underTest = new RemoveElement();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void removeElement(int[] inputNums, int inputVal, int[] expectedNums, int expectedVal) {
        int result = underTest.removeElement(inputNums, inputVal);
        int[] filteredSorted = Arrays.copyOf(inputNums, expectedNums.length);
        Arrays.sort(filteredSorted);

        assertEquals(expectedVal, result);
        assertArrayEquals(expectedNums, filteredSorted);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{3,2,2,3},3, new int[]{2,2},2),
                Arguments.of(new int[]{2,1,2,2,3,0,4,2},2, new int[]{0,1,3,4},4),
                Arguments.of(new int[]{2,2,2,2,2},2, new int[]{2,2,2,2,2},0),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2},2, new int[]{0,0,1,3,4},5)
        );
    }
}