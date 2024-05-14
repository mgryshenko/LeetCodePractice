package com.mgryshenko.leetcode.easy;

import com.mgryshenko.leetcode.utils.ListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 *
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class P876_MiddleOfLinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode middleNode(ListNode head) {
        int midIndex = 0;
        ListNode midNode = head;

        int currIndex = 0;
        ListNode currNode = head;

        while(currNode.next != null) {
            currIndex++;
            currNode = currNode.next;

            int middle = (currIndex + 1) / 2;
            if (middle > midIndex) {
                midNode = midNode.next;
                midIndex = middle;
            }
        }

        return midNode;
    }
}
