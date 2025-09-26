package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsTest {

    @Test
    void givenOverlappingIntervals_whenMerged_thenCorrect() {
        // given
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // when
        int[][] result = MergeIntervals.merge(intervals);

        // then
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result);
    }

    @Test
    void givenNestedIntervals_whenMerged_thenCorrect() {
        // given
        int[][] intervals = {{1, 4}, {2, 3}};

        // when
        int[][] result = MergeIntervals.merge(intervals);

        // then
        assertArrayEquals(new int[][]{{1, 4}}, result);
    }

    @Test
    void givenNonOverlappingIntervals_whenMerged_thenSame() {
        // given
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};

        // when
        int[][] result = MergeIntervals.merge(intervals);

        // then
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, result);
    }

    @Test
    void givenSingleInterval_whenMerged_thenSame() {
        // given
        int[][] intervals = {{1, 5}};

        // when
        int[][] result = MergeIntervals.merge(intervals);

        // then
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void givenEmptyInput_whenMerged_thenEmpty() {
        // given
        int[][] intervals = {};

        // when
        int[][] result = MergeIntervals.merge(intervals);

        // then
        assertArrayEquals(new int[][]{}, result);
    }

    @Test
    void givenTouchingIntervals_whenMerged_thenMerged() {
        // given
        int[][] intervals = {{1, 4}, {4, 5}};

        // when
        int[][] result = MergeIntervals.merge(intervals);

        // then
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }
}