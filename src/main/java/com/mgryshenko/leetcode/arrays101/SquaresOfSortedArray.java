package com.mgryshenko.leetcode.arrays101;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        boolean firstNegative = nums[0] < 0;
        boolean lastNegative = nums[nums.length - 1] < 0;

        if (firstNegative && lastNegative) {
            for (int i = 0; i < nums.length; i++) {
                result[nums.length - i - 1] = nums[i] * nums[i];
            }
        } else if (!firstNegative) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }
        } else {
            int firstPositiveIndex = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= 0) {
                    firstPositiveIndex = i;
                    break;
                }
            }

            int left = firstPositiveIndex - 1;
            int right = firstPositiveIndex;
            for (int i = 0; i < nums.length; i++) {
                if (left > -1 && (right >= nums.length || Math.abs(nums[left]) < nums[right])) {
                    result[i] = nums[left] * nums[left];
                    left--;
                } else {
                    result[i] = nums[right] * nums[right];
                    right++;
                }
            }

        }

        return result;
    }
}
