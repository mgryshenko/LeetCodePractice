package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P14_LongestCommonPrefixTest {

    P14_LongestCommonPrefix underTest = new P14_LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void longestCommonPrefix(String[] input, String expected) {
        String result = underTest.longestCommonPrefix(input);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, ""),
                Arguments.of(new String[]{"abc","abc","ab"}, "ab"),
                Arguments.of(new String[]{"abc","abc","abc"}, "abc"),
                Arguments.of(new String[]{"abc","abc","abcd"}, "abc")
        );
    }
}