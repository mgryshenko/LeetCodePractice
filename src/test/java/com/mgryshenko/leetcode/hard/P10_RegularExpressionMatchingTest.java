package com.mgryshenko.leetcode.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P10_RegularExpressionMatchingTest {

    P10_RegularExpressionMatching underTest = new P10_RegularExpressionMatching();

    @ParameterizedTest
    @CsvSource({
            "aa,a,false",
            "aa,aa,true",
            "aa,.a,true",
            "aa,..,true",
            "aa,a.,true",
            "abc,a.c,true",
            "abc,a..c,false",
            "ac,a.c,false",
            "aa,a*,true",
            "ab,.*,true",
            "abc,.*bc,true",
            "ab,.*bc,false",
            "a,.*bc,false",
            "abd,.*bc,false",
            "abcd,.*bc,false",
            "aab,c*a*b,true",
            "aabcbcbcaccbcaabc,.*a..*,true",
            "aabcbcbcaccbcaabc,.*a*.*a*,true",
            "aabcbcbcaccbcaabc,.*a*aa*.*b*.c*.*a*,true",
            "abcaaaaaaabaabcabac,.*ab.a.*a*a*.*b*b*,true",
            "abcaaaaaaabaabcabac,.*ab.a.*,true",
            "caccccaccbabbcb,c*c*b*a*.*c*.a*a*a*,true",
    })
    void isMatch(String input, String pattern, boolean expected) {
        boolean result = underTest.isMatch(input, pattern);
        assertEquals(expected, result);
    }
}