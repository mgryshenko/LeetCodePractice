package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1672_ReachestCustomerWealthTest {

    P1672_ReachestCustomerWealth underTest = new P1672_ReachestCustomerWealth();

    @Test
    void maximumWealth() {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        int result = underTest.maximumWealth(accounts);

        assertEquals(6, result);

    }
}