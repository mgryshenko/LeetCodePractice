package com.mgryshenko.leetcode.utils;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode list(int... values) {
        if (values.length == 0) {
            return null;
        } else if (values.length == 1) {
            return new ListNode(values[0]);
        }

        ListNode node = new ListNode(values[values.length - 1]);
        for (int i = values.length - 2; i >= 0; i--) {
            node = new ListNode(values[i], node);
        }
        return node;
    }
}
