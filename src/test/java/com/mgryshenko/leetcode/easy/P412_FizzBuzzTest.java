package com.mgryshenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P412_FizzBuzzTest {

    P412_FizzBuzz underTest = new P412_FizzBuzz();

    @Test
    void fizzBuzz() {
        List<String> result = underTest.fizzBuzz(15);
        List<String> expected = List.of(
                "1","2","Fizz","4","Buzz",
                "Fizz","7","8","Fizz","Buzz",
                "11","Fizz","13","14","FizzBuzz"
        );

        assertLinesMatch(expected, result);
    }
}