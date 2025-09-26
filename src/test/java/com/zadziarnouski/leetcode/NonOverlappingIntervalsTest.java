package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonOverlappingIntervalsTest {

    @Test
    void givenOverlappingIntervals_whenErase_thenReturnMinimumRemovedCount() {
        // given
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        // when
        int result = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        // then
        assertEquals(1, result);
    }

    @Test
    void givenAllNonOverlapping_whenErase_thenReturnZero() {
        // given
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        // when
        int result = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        // then
        assertEquals(0, result);
    }

    @Test
    void givenAllOverlapping_whenErase_thenReturnNMinusOne() {
        // given
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        // when
        int result = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        // then
        assertEquals(2, result);
    }

    @Test
    void givenEmptyInput_whenErase_thenReturnZero() {
        // given
        int[][] intervals = {};
        // when
        int result = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        // then
        assertEquals(0, result);
    }

    @Test
    void givenSingleInterval_whenErase_thenReturnZero() {
        // given
        int[][] intervals = {{1, 10}};
        // when
        int result = NonOverlappingIntervals.eraseOverlapIntervals(intervals);
        // then
        assertEquals(0, result);
    }
}