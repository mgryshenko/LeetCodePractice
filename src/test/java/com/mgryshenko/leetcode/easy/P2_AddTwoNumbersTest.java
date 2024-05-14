package com.mgryshenko.leetcode.easy;

import com.mgryshenko.leetcode.utils.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.mgryshenko.leetcode.utils.ListNode.list;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class P2_AddTwoNumbersTest {

    P2_AddTwoNumbers underTest = new P2_AddTwoNumbers();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void addTwoNumbers(ListNode input1, ListNode input2, ListNode expected) {
        ListNode actual = underTest.addTwoNumbers(input1, input2);
        int counter = 0;
        do {
            counter++;
            assertNotNull(actual, "The node #" + counter + " is missing");
            assertNotNull(expected, "The node #" + counter + " is not expected");
            assertEquals(actual.val, expected.val);

            actual = actual.next;
            expected = expected.next;
        } while (expected != null || actual != null);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(list(2,4,3), list(5,6,4), list(7,0,8)),
                Arguments.of(list(0), list(0), list(0)),
                Arguments.of(list(9), list(1,9,9,9,9,9,9,9,9,9), list(0,0,0,0,0,0,0,0,0,0,1)),
                Arguments.of(list(2,4,9), list(5,6,4,9), list(7,0,4,0,1)),
                Arguments.of(list(9,9,9,9,9,9,9), list(9,9,9,9), list(8,9,9,9,0,0,0,1))
        );
    }
}