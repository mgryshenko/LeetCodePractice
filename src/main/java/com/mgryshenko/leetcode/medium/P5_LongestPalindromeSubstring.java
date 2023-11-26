package com.mgryshenko.leetcode.medium;

/**
 * Given a string s, return the longest
 * palindromic substring in s.
 * <p>
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class P5_LongestPalindromeSubstring {

    public String longestPalindrome(String s) {
        int interval = s.length();

        while (interval > 1) {
            int times = s.length() - interval + 1;
            for (int i = 0; i < times; i++) {
                int start = i;
                int end = i + interval - 1;
                while (s.charAt(start) == s.charAt(end) && start < end) {
                    start++;
                    end--;
                }
                if (end - start < 1) {
                    return s.substring(i, i + interval);
                }
            }
            interval--;
        }

        return s.substring(0,1);
    }
}
