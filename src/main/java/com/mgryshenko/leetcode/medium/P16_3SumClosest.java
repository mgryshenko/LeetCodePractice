package com.mgryshenko.leetcode.medium;

import java.util.Arrays;


/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Example 1:
 *
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 *
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 500
 * -1000 <= nums[i] <= 1000
 * -10^4 <= target <= 10^4
 */
public class P16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[2];
        int closestDiff = Math.abs(target - closestSum);

        Arrays.sort(nums);
        for (int l = 0; l < nums.length; l++) {
            for (int r = nums.length - 1; r > l + 1; r--) {
                int lrSum = nums[l] + nums[r];
                int targetNum = target - lrSum;

                // binary search for closest number
                int rc = r - 1;
                int lc = l + 1;
                // t = 10;
                // -1 10 20 30 40 50
                while(rc - lc > 1) {
                    int mc = ((rc - lc) / 2) + lc;
                    if (nums[mc] > targetNum) {
                        rc = mc;
                    } else {
                        lc = mc;
                    }
                }

                int leftDiff = Math.abs(targetNum - nums[lc]);
                int rightDiff = Math.abs(targetNum - nums[rc]);
                if (rightDiff < closestDiff) {
                    closestDiff = rightDiff;
                    closestSum = lrSum + nums[rc];
                } else if (leftDiff < closestDiff) {
                    closestDiff = leftDiff;
                    closestSum = lrSum + nums[lc];
                }

                if (closestDiff == 0) {
                    return closestSum;
                }
            }
        }

        return closestSum;
    }
}
