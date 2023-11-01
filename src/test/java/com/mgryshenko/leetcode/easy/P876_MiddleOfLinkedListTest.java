package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P876_MiddleOfLinkedListTest {

    P876_MiddleOfLinkedList underTest = new P876_MiddleOfLinkedList();

    @Test
    void oddSizeList() {
        P876_MiddleOfLinkedList.ListNode node5 = new P876_MiddleOfLinkedList.ListNode(5);
        P876_MiddleOfLinkedList.ListNode node4 = new P876_MiddleOfLinkedList.ListNode(4, node5);
        P876_MiddleOfLinkedList.ListNode node3 = new P876_MiddleOfLinkedList.ListNode(3, node4);
        P876_MiddleOfLinkedList.ListNode node2 = new P876_MiddleOfLinkedList.ListNode(2, node3);
        P876_MiddleOfLinkedList.ListNode node1 = new P876_MiddleOfLinkedList.ListNode(1, node2);

        P876_MiddleOfLinkedList.ListNode result = underTest.middleNode(node1);

        assertEquals(node3, result);
    }

    @Test
    void evenSizeList() {
        P876_MiddleOfLinkedList.ListNode node6 = new P876_MiddleOfLinkedList.ListNode(6);
        P876_MiddleOfLinkedList.ListNode node5 = new P876_MiddleOfLinkedList.ListNode(5, node6);
        P876_MiddleOfLinkedList.ListNode node4 = new P876_MiddleOfLinkedList.ListNode(4, node5);
        P876_MiddleOfLinkedList.ListNode node3 = new P876_MiddleOfLinkedList.ListNode(3, node4);
        P876_MiddleOfLinkedList.ListNode node2 = new P876_MiddleOfLinkedList.ListNode(2, node3);
        P876_MiddleOfLinkedList.ListNode node1 = new P876_MiddleOfLinkedList.ListNode(1, node2);

        P876_MiddleOfLinkedList.ListNode result = underTest.middleNode(node1);

        assertEquals(node4, result);
    }
}