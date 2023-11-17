package com.mgryshenko.leetcode.arrays101;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class FindAllDisappearedTest {

    FindAllDisappeared underTest = new FindAllDisappeared();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void findDisappearedNumbers(int[] input, List<Integer> expected) {
        List<Integer> result = underTest.findDisappearedNumbers(input);
        assertIterableEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{4,3,2,7,8,2,3,1}, List.of(5,6)),
                Arguments.of(new int[]{1,2,2}, List.of(3)),
                Arguments.of(new int[]{2,2,2}, List.of(1,3)),
                Arguments.of(new int[]{2,2,3}, List.of(1)),
                Arguments.of(new int[]{1,2,3}, List.of()),
                Arguments.of(new int[]{1,1}, List.of(2))
        );
    }
}