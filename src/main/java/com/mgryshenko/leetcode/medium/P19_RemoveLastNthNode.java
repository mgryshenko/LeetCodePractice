package com.mgryshenko.leetcode.medium;

import com.mgryshenko.leetcode.utils.ListNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 *
 *
 * Example 1:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Example 2:
 *
 * Input: head = [1], n = 1
 * Output: []
 * Example 3:
 *
 * Input: head = [1,2], n = 1
 * Output: [1]
 *
 * Constraints:
 *
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
public class P19_RemoveLastNthNode {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode(0, head);
        ListNode l = root;
        ListNode r = head;

        int countR = 0;

        while(r != null) {
            r = r.next;
            countR++;

            if (countR > n) {
                l = l.next;
            }
        }

        l.next = l.next.next;

        return root.next;
    }
}
