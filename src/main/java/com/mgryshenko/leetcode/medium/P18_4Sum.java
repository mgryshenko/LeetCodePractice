package com.mgryshenko.leetcode.medium;

import java.util.*;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 *
 * 0 <= a, b, c, d < n
 * a, b, c, and d are distinct.
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * Example 2:
 *
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 200
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 */
public class P18_4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Map<Integer, Integer> numCounts = new HashMap<>(nums.length, 1.0F);

        Arrays.sort(nums);
        for (int num : nums) {
            Integer count = numCounts.getOrDefault(num, 0);
            numCounts.put(num, count + 1);
        }

        long targetL = target;

        List<List<Integer>> debug = new ArrayList<>();

        Set<Quadruplet> quadruplets = new HashSet<>();
        for (int l = 0; l < nums.length; l++) {
            for (int r = nums.length - 1; r > l + 2; r--) {
                for (int m = l + 1; m < r - 1; m++) {
                    long desiredNumL = targetL - nums[l] - nums[r] - nums[m];

                    if (desiredNumL < Integer.MIN_VALUE || desiredNumL > Integer.MAX_VALUE) {
                        debug.add(Arrays.asList(l, m, r, null));
                        continue;
                    }
                    debug.add(Arrays.asList(l, m, r, (int) desiredNumL));


                    int desiredNum = (int) desiredNumL;
                    Integer desiredNumCounts = numCounts.get(desiredNum);
                    if (desiredNumCounts == null) {
                        continue;
                    }

                    desiredNumCounts -= desiredNum == nums[l] ? 1 : 0;
                    desiredNumCounts -= desiredNum == nums[m] ? 1 : 0;
                    desiredNumCounts -= desiredNum == nums[r] ? 1 : 0;

                    if (desiredNumCounts > 0) {
                        quadruplets.add(Quadruplet.of(nums[l], nums[m], nums[r], desiredNum));
                    }
                }
            }
            numCounts.put(nums[l], numCounts.get(nums[l] - 1));
        }

        System.out.println(debug.size());
        debug.forEach(System.out::println);

        List<List<Integer>> result = new ArrayList<>();
        for (P18_4Sum.Quadruplet q : quadruplets) {
            result.add(List.of(q.i(), q.j(), q.k(), q.l()));
        }
        return result;
    }

    private record Quadruplet(int i, int j, int k, int l) {

        public static Quadruplet of(int l, int m, int r, int d) {
            if (d < m) {
                if (d > l) {
                    return new Quadruplet(l, d, m, r);
                } else {
                    return new Quadruplet(d, l, m, r);
                }
            } else if (d < r) {
                return new Quadruplet(l, m, d, r);
            } else {
                return new Quadruplet(l, m, r, d);
            }
        }

    }
}
