package com.mgryshenko.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class P20_ValidParenthesis {

    public boolean isValid(String s) {

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            Integer c = (int) s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                queue.add(c);
            } else if (!queue.isEmpty()) {
                Integer prev = queue.removeLast();
                Integer required;
                if (c == ')') {
                    required = 40;
                } else if (c == ']') {
                    required = 91;
                } else {
                    required = 123;
                }
                if (prev != required) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return queue.isEmpty();
    }
}
