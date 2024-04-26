package com.mgryshenko.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P17_LetterCombinationsPhoneTest {

    P17_LetterCombinationsPhone underTest = new P17_LetterCombinationsPhone();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void letterCombinations(String input, List<String> expected) {
        List<String> result = underTest.letterCombinations(input);
        assertIterableEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("23", List.of("ad","ae","af","bd","be","bf","cd","ce","cf")),
                Arguments.of("", List.of()),
                Arguments.of("2", List.of("a","b","c"))
        );
    }
}