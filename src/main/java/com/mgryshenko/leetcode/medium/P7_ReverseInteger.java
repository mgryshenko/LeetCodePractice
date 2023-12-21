package com.mgryshenko.leetcode.medium;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 *
 *
 * Constraints:
 *
 * -2^31 <= x <= 2^31 - 1
 */
public class P7_ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        int multiplier = 1;
        boolean hasFirstNumber = false;
        for (int divisor = 1_000_000_000; divisor > 1; divisor /= 10) {
            int number = x / divisor;
            if (hasFirstNumber || number != 0) {
                result += number * multiplier;
                x -= number * divisor;
                hasFirstNumber = true;
                multiplier *= 10;
                System.out.println("number: " + number + ", result: " + result + ", x: " + x + ", multiplier: " + multiplier);
            }
        }

        if (multiplier == 1_000_000_000 && (x < -2 || x > 2)
                || ((result < -147483648 && x <= 2) || (result > 147483647 && x >= 2))) {
            return 0;
        } else {
            return result + x * multiplier;
        }
    }
}
