package com.mgryshenko.leetcode.easy;

import com.mgryshenko.leetcode.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.mgryshenko.leetcode.utils.ListNode.list;
import static org.junit.jupiter.api.Assertions.*;

class P21_MergeTwoSortedListsTest {

    P21_MergeTwoSortedLists underTest = new P21_MergeTwoSortedLists();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void addTwoNumbers(ListNode input1, ListNode input2, ListNode expected) {
        ListNode actual = underTest.mergeTwoLists(input1, input2);

        if (expected == null) {
            assertNull(actual);
        } else {
            while (expected != null) {
                assertEquals(expected.val, actual.val);
                expected = expected.next;
                actual = actual.next;
            }
        }
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(list(1,2,4), list(1,3,4), list(1,1,2,3,4,4)),
                Arguments.of(list(), list(), list()),
                Arguments.of(list(), list(0), list(0))
        );
    }

}