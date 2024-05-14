package com.mgryshenko.leetcode.medium;

import com.mgryshenko.leetcode.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.mgryshenko.leetcode.utils.ListNode.list;
import static org.junit.jupiter.api.Assertions.*;

class P19_RemoveLastNthNodeTest {

    P19_RemoveLastNthNode underTest = new P19_RemoveLastNthNode();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void addTwoNumbers(ListNode input1, int input2, ListNode expected) {
        ListNode actual = underTest.removeNthFromEnd(input1, input2);

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
                Arguments.of(list(1,2,3,4,5), 2, list(1,2,3,5)),
                Arguments.of(list(1), 1, null),
                Arguments.of(list(1,2), 1, list(1))
        );
    }

}