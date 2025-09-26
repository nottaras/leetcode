package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertIntervalTest {

    @Test
    void testInsertBetweenNonOverlapping() {
        // given
        int[][] intervals = {{1, 2}, {5, 6}};
        int[] newInterval = {3, 4};

        // when
        int[][] result = InsertInterval.insert(intervals, newInterval);

        // then
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, result);
    }

    @Test
    void testInsertOverlappingMerge() {
        // given
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        // when
        int[][] result = InsertInterval.insert(intervals, newInterval);

        // then
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, result);
    }

    @Test
    void testInsertAtBeginning() {
        // given
        int[][] intervals = {{5, 7}, {8, 10}};
        int[] newInterval = {1, 2};

        // when
        int[][] result = InsertInterval.insert(intervals, newInterval);

        // then
        assertArrayEquals(new int[][]{{1, 2}, {5, 7}, {8, 10}}, result);
    }

    @Test
    void testInsertAtEnd() {
        // given
        int[][] intervals = {{1, 3}, {4, 5}};
        int[] newInterval = {6, 8};

        // when
        int[][] result = InsertInterval.insert(intervals, newInterval);

        // then
        assertArrayEquals(new int[][]{{1, 3}, {4, 5}, {6, 8}}, result);
    }

    @Test
    void testInsertIntoEmpty() {
        // given
        int[][] intervals = {};
        int[] newInterval = {4, 8};

        // when
        int[][] result = InsertInterval.insert(intervals, newInterval);

        // then
        assertArrayEquals(new int[][]{{4, 8}}, result);
    }

    @Test
    void testInsertFullyOverlapping() {
        // given
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};

        // when
        int[][] result = InsertInterval.insert(intervals, newInterval);

        // then
        assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, result);
    }
}