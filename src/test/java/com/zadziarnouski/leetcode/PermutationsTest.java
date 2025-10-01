package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationsTest {

    @Test
    void shouldReturnAllPermutationsForThreeElements() {
        // given
        int[] nums = {1, 2, 3};

        // when
        List<List<Integer>> result = Permutations.permute(nums);

        // then
        assertEquals(6, result.size());
        assertTrue(result.contains(List.of(1, 2, 3)));
        assertTrue(result.contains(List.of(1, 3, 2)));
        assertTrue(result.contains(List.of(2, 1, 3)));
        assertTrue(result.contains(List.of(2, 3, 1)));
        assertTrue(result.contains(List.of(3, 1, 2)));
        assertTrue(result.contains(List.of(3, 2, 1)));
    }

    @Test
    void shouldReturnSinglePermutationForSingleElement() {
        // given
        int[] nums = {42};

        // when
        List<List<Integer>> result = Permutations.permute(nums);

        // then
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(42)));
    }

    @Test
    void shouldReturnEmptyListForEmptyInput() {
        // given
        int[] nums = {};

        // when
        List<List<Integer>> result = Permutations.permute(nums);

        // then
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of()));
    }

}