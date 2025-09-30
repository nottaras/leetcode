package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    @Test
    void shouldReturnAllCombinationsOfTwoFromFour() {
        // given
        int n = 4;
        int k = 2;

        // when
        List<List<Integer>> result = Combinations.combine(n, k);

        // then
        assertEquals(6, result.size());
        assertTrue(result.contains(List.of(1, 2)));
        assertTrue(result.contains(List.of(2, 3)));
        assertTrue(result.contains(List.of(3, 4)));
    }

    @Test
    void shouldReturnSingleCombination_whenKEqualsN() {
        // given
        int n = 3;
        int k = 3;

        // when
        List<List<Integer>> result = Combinations.combine(n, k);

        // then
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2, 3), result.getFirst());
    }

    @Test
    void shouldReturnEmptyList_whenKGreaterThanN() {
        // given
        int n = 3;
        int k = 4;

        // when
        List<List<Integer>> result = Combinations.combine(n, k);

        // then
        assertTrue(result.isEmpty());
    }
}