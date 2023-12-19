package com.mgryshenko.leetcode.medium;

import java.util.Arrays;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
public class P6_ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }

        int charsPerSection = numRows + numRows - 2;
        int sections = s.length() / charsPerSection + 1;

        char[] result = new char[s.length()];
        int resultIndex = 0;
        int leftSectionChar = 0;
        int rightSectionChar = charsPerSection;
        while(leftSectionChar <= rightSectionChar) {
            for (int section = 0; section < sections; section++) {
                int leftCharIndex = section * charsPerSection + leftSectionChar;
                if (leftCharIndex < s.length()) {
                    result[resultIndex++] = s.charAt(leftCharIndex);
                } else {
                    break;
                }

                int rightCharIndex = section * charsPerSection + rightSectionChar;
                if (rightCharIndex < s.length()
                        && rightSectionChar < charsPerSection
                        && leftCharIndex < rightCharIndex) {
                    result[resultIndex++] = s.charAt(rightCharIndex);
                }

            }
            leftSectionChar++;
            rightSectionChar--;
        }

        return String.valueOf(result);
    }
}
