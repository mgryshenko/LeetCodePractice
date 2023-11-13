package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSortedDuplicatesTest {

    RemoveSortedDuplicates underTest = new RemoveSortedDuplicates();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void removeDuplicates(int[] inputNums, int[] expectedNums, int expectedUniques) {
        int result = underTest.removeDuplicates(inputNums);

        assertEquals(expectedUniques, result);
        assertArrayEquals(expectedNums, Arrays.copyOf(inputNums, expectedUniques));
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, new int[]{1,2},2),
                Arguments.of(new int[]{1}, new int[]{1},1),
                Arguments.of(new int[]{2,2}, new int[]{2},1),
                Arguments.of(new int[]{5,5,5,5,5}, new int[]{5},1),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, new int[]{0,1,2,3,4},5),
                Arguments.of(new int[]{0,1,2,3,4,5}, new int[]{0,1,2,3,4,5},6)
        );
    }
}