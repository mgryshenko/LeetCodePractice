package com.mgryshenko.leetcode.arrays101;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 * Example 2:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 *
 *
 * Constraints:
 *
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 */
public class SearchingItems {

    public boolean checkIfExist(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                int half = arr[j] / 2;
                for (int i = 0; i < arr.length; i++) {
                    if (i != j && arr[i] == half) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
