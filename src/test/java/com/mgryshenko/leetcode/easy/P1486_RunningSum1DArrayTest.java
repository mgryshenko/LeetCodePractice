package com.mgryshenko.leetcode.easy;

import com.mgryshenko.leetcode.easy.P1486_RunningSum1DArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1486_RunningSum1DArrayTest {

    P1486_RunningSum1DArray underTest = new P1486_RunningSum1DArray();

    @Test
    void test() {
        int[] a1 = {1,2,3,4,5};

        int[] result = underTest.runningSum(a1);

        assertArrayEquals(result, new int[]{1,3,6,10,15});
    }
}