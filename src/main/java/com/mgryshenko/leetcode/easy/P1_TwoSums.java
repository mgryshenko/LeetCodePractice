package com.mgryshenko.leetcode.easy;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^4
 * -109 <= nums[i] <= 10^9
 * -109 <= target <= 10^9
 * Only one valid answer exists.
 * <p>
 * <p>
 * Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
 */
public class P1_TwoSums {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[]{0, 1};
        }

        for (int i = 0; i < nums.length; i++) {
            int summand = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == summand) {
                    return new int[]{i, j};
                }
            }
        }

        return nums;
    }
}
