package com.mgryshenko.leetcode.easy;

import com.mgryshenko.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P876_MiddleOfLinkedListTest {

    P876_MiddleOfLinkedList underTest = new P876_MiddleOfLinkedList();

    @Test
    void oddSizeList() {
        ListNode head = ListNode.list(1,2,3,4,5);

        ListNode result = underTest.middleNode(head);

        assertEquals(head.next.next, result);
    }

    @Test
    void evenSizeList() {
        ListNode head = ListNode.list(1,2,3,4,5,6);

        ListNode result = underTest.middleNode(head);

        assertEquals(head.next.next.next, result);
    }
}