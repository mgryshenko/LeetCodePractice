package com.mgryshenko.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 *  1
 *  2: abc
 *  3: def
 *  4: ghi
 *  5: jkl
 *  6: mno
 *  7: pqrs
 *  8: tuv
 *  9: wxyz
 *  *: +
 *  0: Space
 *  Shift: #
 *
 *
 * Example 1:
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 *
 * Input: digits = ""
 * Output: []
 * Example 3:
 *
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 *
 * Constraints:
 *
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
public class P17_LetterCombinationsPhone {

    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> layout = Map.of(
                '2', new char[]{'a', 'b', 'c'},
                '3', new char[]{'d', 'e', 'f'},
                '4', new char[]{'g', 'h', 'i'},
                '5', new char[]{'j', 'k', 'l'},
                '6', new char[]{'m', 'n', 'o'},
                '7', new char[]{'p', 'q', 'r', 's'},
                '8', new char[]{'t', 'u', 'v'},
                '9', new char[]{'w', 'x', 'y', 'z'}
        );

        int count = digits.isEmpty() ? 0 : layout.get(digits.charAt(0)).length;
        for (int i = 1; i < digits.length(); i++) {
            count *= layout.get(digits.charAt(i)).length;
        }

        char[][] combinations = new char[count][digits.length()];


        for (int d = 0; d < digits.length(); d++) {
            char[] letters = layout.get(digits.charAt(d));
            count /= letters.length;

            for (int i = 0; i < combinations.length; i++) {
                combinations[i][d] = letters[(i / count) % letters.length];
            }
        }

        String[] result = new String[combinations.length];
        for (int i = 0; i < combinations.length; i++) {
            result[i] = String.valueOf(combinations[i]);
        }

        return Arrays.asList(result);
    }
}
