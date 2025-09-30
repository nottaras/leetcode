package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIITest {

    @Test
    void givenCandidatesWithDuplicates_whenTargetIs8_thenReturnUniqueCombinations() {
        // given
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        // when
        List<List<Integer>> result = CombinationSumII.combinationSum2(candidates, target);

        // then
        assertEquals(4, result.size());
        assertTrue(result.contains(List.of(1, 1, 6)));
        assertTrue(result.contains(List.of(1, 2, 5)));
        assertTrue(result.contains(List.of(1, 7)));
        assertTrue(result.contains(List.of(2, 6)));
    }

    @Test
    void givenAllOnes_whenTargetIs2_thenReturnOneCombination() {
        // given
        int[] candidates = {1, 1, 1, 1, 1};
        int target = 2;

        // when
        List<List<Integer>> result = CombinationSumII.combinationSum2(candidates, target);

        // then
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(1, 1)));
    }

    @Test
    void givenEmptyCandidates_whenTargetIs3_thenReturnEmptyList() {
        // given
        int[] candidates = {};
        int target = 3;

        // when
        List<List<Integer>> result = CombinationSumII.combinationSum2(candidates, target);

        // then
        assertTrue(result.isEmpty());
    }
}