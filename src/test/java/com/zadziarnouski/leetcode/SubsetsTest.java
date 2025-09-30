package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @Test
    void givenEmptyArray_whenGenerateSubsets_thenReturnEmptySubsetOnly() {
        // Given
        int[] nums = {};

        // When
        List<List<Integer>> result = Subsets.subsets(nums);

        // Then
        List<List<Integer>> expected = List.of(List.of());
        assertEquals(expected, result);
    }

    @Test
    void givenOneElement_whenGenerateSubsets_thenReturnAllSubsets() {
        // Given
        int[] nums = {1};

        // When
        List<List<Integer>> result = Subsets.subsets(nums);

        // Then
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1)
        );
        assertTrue(result.containsAll(expected));
        assertEquals(expected.size(), result.size());
    }

    @Test
    void givenTwoElements_whenGenerateSubsets_thenReturnAllSubsets() {
        // Given
        int[] nums = {1, 2};

        // When
        List<List<Integer>> result = Subsets.subsets(nums);

        // Then
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2)
        );
        assertTrue(result.containsAll(expected));
        assertEquals(expected.size(), result.size());
    }

    @Test
    void givenThreeElements_whenGenerateSubsets_thenReturnAllSubsets() {
        // Given
        int[] nums = {1, 2, 3};

        // When
        List<List<Integer>> result = Subsets.subsets(nums);

        // Then
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
        assertTrue(result.containsAll(expected));
        assertEquals(expected.size(), result.size());
    }
}