package com.mgryshenko.leetcode.arrays101;

/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 * Example 2:
 *
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 *
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2 (both 2's are counted together since they have the same value).
 * The third distinct maximum is 1.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * -231 <= nums[i] <= 2^31 - 1
 *
 *
 * Follow up: Can you find an O(n) solution?
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }


        int max1 = nums[0];
        int max2 = max1;
        int max3 = max2;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max3) {
                max1 = max2;
                max2 = max3;
                max3 = nums[i];
            } else if (nums[i] > max2 && nums[i] < max3) {
                max1 = max2;
                max2 = nums[i];
            } else if (nums[i] > max1 && nums[i] < max2) {
                max1 = nums[i];
            } else if (max3 <= max2) {
                max1 = max2;
                max2 = nums[i];
            } else if (max2 <= max1){
                max1 = nums[i];
            }
        }

        return max1 != max2 ? max1 : max3;
    }
}
