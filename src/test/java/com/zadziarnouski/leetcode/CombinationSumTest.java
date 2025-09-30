package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CombinationSumTest {

    @Test
    void givenMultipleCandidates_whenTarget7_thenCorrectCombinations() {
        // Given
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        // When
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        // Then
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(7)));
        assertTrue(result.contains(List.of(2, 2, 3)));
    }

    @Test
    void givenSingleCandidate_whenTarget3_thenNoCombinations() {
        // Given
        int[] candidates = {2};
        int target = 3;

        // When
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        // Then
        assertEquals(0, result.size());
    }

    @Test
    void givenEmptyCandidates_whenAnyTarget_thenNoCombinations() {
        // Given
        int[] candidates = {};
        int target = 7;

        // When
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        // Then
        assertEquals(0, result.size());
    }

    @Test
    void givenSingleCandidateEqualToTarget_whenExactMatch_thenOneCombination() {
        // Given
        int[] candidates = {5};
        int target = 5;

        // When
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        // Then
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(5)));
    }
}