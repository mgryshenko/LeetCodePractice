package com.mgryshenko.leetcode.easy;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -2^31 <= x <= 2^31 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class P9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        boolean digitsStarted = false;
        for (int divisor = 1_000_000_000; divisor > 0; divisor /= 10) {
            int leftDigit = x / divisor;
            if (digitsStarted || leftDigit > 0) {
                if (leftDigit != x % 10) {
                    return false;
                }

                x = (x - (leftDigit * divisor)) / 10;
                divisor /= 10;
                digitsStarted = true;
            }
        }

        return true;
    }
}
