package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GenerateParenthesesTest {

    @Test
    void shouldReturnSinglePair_whenNIsOne() {
        // given
        int n = 1;

        // when
        List<String> result = GenerateParentheses.generateParenthesis(n);

        // then
        assertEquals(List.of("()"), result);
    }

    @Test
    void shouldReturnAllValidCombinations_whenNIsTwo() {
        // given
        int n = 2;

        // when
        List<String> result = GenerateParentheses.generateParenthesis(n);

        // then
        assertTrue(result.contains("()()"));
        assertTrue(result.contains("(())"));
        assertEquals(2, result.size());
    }

    @Test
    void shouldReturnAllValidCombinations_whenNIsThree() {
        // given
        int n = 3;

        // when
        List<String> result = GenerateParentheses.generateParenthesis(n);

        // then
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()(())"));
        assertTrue(result.contains("()()()"));
        assertEquals(5, result.size());
    }
}