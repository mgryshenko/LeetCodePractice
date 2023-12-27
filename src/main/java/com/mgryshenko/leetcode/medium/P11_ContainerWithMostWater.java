package com.mgryshenko.leetcode.medium;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * Example 2:
 *
 * Input: height = [1,1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * n == height.length
 * 2 <= n <= 10^5
 * 0 <= height[i] <= 10^4
 */
public class P11_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        int leftMax = 0;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] < leftMax) {
                continue;
            }
            leftMax = height[i];
            for (int j = height.length - 1; j > i; j--) {
                if (leftMax > height[j]) {
                    if (height[j] * (j - i) > max) {
                        max = height[j] * (j - i);
                    }
                } else {
                    if (leftMax * (j - i) > max) {
                        max = leftMax * (j - i);
                    }
                    break;
                }
            }
        }

        return max;
    }
}
