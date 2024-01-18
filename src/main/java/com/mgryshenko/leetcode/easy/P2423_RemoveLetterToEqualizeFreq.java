package com.mgryshenko.leetcode.easy;

/**
 * You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.
 *
 * Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.
 *
 * Note:
 *
 * The frequency of a letter x is the number of times it occurs in the string.
 * You must remove exactly one letter and cannot choose to do nothing.
 *
 * Example 1:
 *
 * Input: word = "abcc"
 * Output: true
 * Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.
 * Example 2:
 *
 * Input: word = "aazz"
 * Output: false
 * Explanation: We must delete a character, so either the frequency of "a" is 1 and the frequency of "z" is 2, or vice versa. It is impossible to make all present letters have equal frequency.
 *
 * Constraints:
 *
 * 2 <= word.length <= 100
 * word consists of lowercase English letters only.
 */
public class P2423_RemoveLetterToEqualizeFreq {

    public boolean equalFrequency(String word) {

        int[] freqs = new int['z' - 'a' + 1];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            freqs[c - 'a'] += 1;
        }

        int freq1 = 0;
        int freq2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int freq : freqs) {
            if (freq == 0) {
                continue;
            }
            if (freq1 == 0) {
                freq1 = freq;
                count1++;
            } else if (freq == freq1) {
                count1++;
            } else if (freq2 == 0) {
                freq2 = freq;
                count2++;
            } else if (freq == freq2) {
                count2++;
            } else {
                return false;
            }
        }

        return freq2 == 0 && (freq1 == 1 || count1 == 1)
                || freq1 == 1 && count1 == 1
                || freq2 == 1 && count2 == 1
                || freq2 - freq1 == 1 && count2 == 1
                || freq1 - freq2 == 1 && count1 == 1;
    }
}
