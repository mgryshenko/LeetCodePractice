package com.mgryshenko.leetcode.hard;

/**
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 *
 * '.' Matches any single character.​​​​
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 *
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * Example 3:
 *
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 20
 * 1 <= p.length <= 20
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '.', and '*'.
 * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */
public class P10_RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        // Collapse multiple ".*" wildcards
        if (p.length() > 3) {
            for (int i = 3; i < p.length(); i++) {
                char c1 = p.charAt(i - 2);
                char c3 = p.charAt(i);
                if (c3 == '*' && c1 == '*') {
                    char c0 = p.charAt(i - 3);
                    char c2 = p.charAt(i - 1);
                    if (c0 == '.' || c2 == '.') {
                        p = p.substring(0, i - 3) + ".*" + p.substring(i + 1);
                        i = 3;
                    } else if (c0 == c2) {
                        p = p.substring(0, i - 3) + c0 + "*" + p.substring(i + 1);
                        i = 3;
                    }
                }
            }
        }

        return isMatch2(s, p);

    }

    private boolean isMatch2(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        if (p.length() > 1 && p.charAt(1) == '*') {
            char repetitiveChar = p.charAt(0);
            p = p.substring(2);

            if (repetitiveChar == '.' && p.isEmpty()) {
                return true;
            }
            while(!s.isEmpty()) {
                if (isMatch2(s, p)) {
                    return true;
                } else if (s.charAt(0) != repetitiveChar && repetitiveChar != '.') {
                    return false;
                }
                s = s.substring(1);
            }

            return p.isEmpty() || (p.length() == 2 && p.charAt(1) == '*');
        }
        if (!s.isEmpty()) {
            for (int i = 0; i < p.length(); i++) {
                char pChar = p.charAt(0);

                if (p.length() > 1 && p.charAt(1) == '*') {
                    break;
                } else if (s.isEmpty()
                        || (pChar != '.' && pChar != s.charAt(0))) {
                    return false;
                }

                s = s.substring(1);
                p = p.substring(1);
            }

            return isMatch2(s, p);
        }

        return false;
    }
}
