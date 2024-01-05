package com.mgryshenko.leetcode.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class P14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
            int j = 0;
            while (j < min) {
                if (strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                    min = j;
                }
                j++;
            }

            if (min == 0) {
                break;
            }
        }

        return strs[0].substring(0, min);
    }
}
