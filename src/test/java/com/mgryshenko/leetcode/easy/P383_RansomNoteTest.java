package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P383_RansomNoteTest {

    P383_RansomNote underTest = new P383_RansomNote();

    @ParameterizedTest
    @CsvSource({"a,b,false","aa,ab,false","aa,aab,true"})
    void canConstruct(String ransomNote, String magazine, boolean expected) {
        boolean result = underTest.canConstruct(ransomNote, magazine);

        assertEquals(expected, result);
    }
}