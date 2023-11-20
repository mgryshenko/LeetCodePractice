package com.mgryshenko.leetcode.hard;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class P4_MedianOfSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double middleIndex = (nums1.length + nums2.length) / 2.0d - 0.5d;
        int rIndex = (int) Math.ceil(middleIndex);
        int lIndex = (int) Math.floor(middleIndex);

        int prev = 0;
        int curr = 0;
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i <= rIndex && i1 < nums1.length && i2 < nums2.length; i++) {
            prev = curr;
            if (nums1[i1] > nums2[i2]) {
                curr = nums2[i2++];
            } else {
                curr = nums1[i1++];
            }
        }


        if (rIndex >= (i1 + i2)) {
            int ir = (rIndex - i1 - i2);
            int last = (i1 == nums1.length) ? i2 : i1;
            int[] nums = (i1 == nums1.length) ? nums2 : nums1;

            prev = (ir == 0) ? curr : nums[ir + last - 1];
            curr = nums[ir + last];
        }


        return rIndex == lIndex ? curr : (curr + prev) / 2.0d;
    }
}
