package com.mgryshenko.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 3000
 * -10^5 <= nums[i] <= 10^5
 */
public class P15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>(nums.length);

        Arrays.sort(nums);
        for (int num : nums) {
            Integer count = numCounts.getOrDefault(num, 0);
            numCounts.put(num, count + 1);
        }

        Set<Triplet> triplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                int desiredNum = 0 - nums[i] - nums[j];
                Integer desiredNumCounts = numCounts.get(desiredNum);
                if (desiredNumCounts == null) {
                    continue;
                }
                if (desiredNum == nums[i]) {
                    desiredNumCounts--;
                }
                if (desiredNum == nums[j]) {
                    desiredNumCounts--;
                }
                if (desiredNumCounts > 0) {
                    triplets.add(Triplet.of(desiredNum, nums[i], nums[j]));
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Triplet t : triplets) {
            result.add(List.of(t.i(), t.j(), t.k()));
        }
        System.out.println(result);
        return result;
    }

    private record Triplet(int i, int j, int k) {
        public static Triplet of(int i, int j, int k) {
            if (i > j) {
                if (j > k) {
                    return new Triplet(i, j, k);
                } else if (i > k){
                    return new Triplet(i, k, j);
                } else {
                    return new Triplet(k, i, j);
                }
            } else if (i > k) {
                return new Triplet(j, i, k);
            } else if (j > k) {
                return new Triplet(j, k, i);
            } else {
                return new Triplet(k, j, i);
            }
        }
    }
}
