package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsIITest {

    @Test
    void givenArrayWithDuplicates_whenGenerateSubsets_thenNoDuplicateSubsets() {
        // given
        int[] nums = {1, 2, 2};

        // when
        List<List<Integer>> result = SubsetsII.subsetsWithDup(nums);

        // then
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(2, 2),
                List.of(1, 2, 2)
        );

        assertEquals(
                new HashSet<>(expected),
                new HashSet<>(result)
        );
    }

    @Test
    void givenEmptyArray_whenGenerateSubsets_thenReturnEmptySetOnly() {
        // given
        int[] nums = {};

        // when
        List<List<Integer>> result = SubsetsII.subsetsWithDup(nums);

        // then
        List<List<Integer>> expected = List.of(List.of());

        assertEquals(expected, result);
    }

    @Test
    void givenArrayWithAllSameElements_whenGenerateSubsets_thenReturnCorrect() {
        // given
        int[] nums = {2, 2, 2};

        // when
        List<List<Integer>> result = SubsetsII.subsetsWithDup(nums);

        // then
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(2),
                List.of(2, 2),
                List.of(2, 2, 2)
        );

        assertEquals(
                new HashSet<>(expected),
                new HashSet<>(result)
        );
    }
}