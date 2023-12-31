package com.mgryshenko.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 *
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 *
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 104
 */
public class P412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            boolean isFizz = (i % 3) == 0;
            boolean isBuzz = (i % 5) == 0;

            if (isFizz && isBuzz) {
                result[i - 1] = "FizzBuzz";
            } else if (isFizz) {
                result[i - 1] = "Fizz";
            } else if (isBuzz) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }

        return Arrays.asList(result);
    }
}
