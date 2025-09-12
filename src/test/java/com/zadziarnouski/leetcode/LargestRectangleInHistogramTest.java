package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestRectangleInHistogramTest {

    @Test
    void givenSingleBar_whenCalculateMaxArea_thenCorrect() {
        // given
        int[] heights = {5};

        // when
        int result = LargestRectangleInHistogram.largestRectangleArea(heights);

        // then
        assertEquals(5, result);
    }

    @Test
    void givenIncreasingBars_whenCalculateMaxArea_thenCorrect() {
        // given
        int[] heights = {1, 2, 3, 4, 5};

        // when
        int result = LargestRectangleInHistogram.largestRectangleArea(heights);

        // then
        assertEquals(9, result);
    }

    @Test
    void givenDecreasingBars_whenCalculateMaxArea_thenCorrect() {
        // given
        int[] heights = {5, 4, 3, 2, 1};

        // when
        int result = LargestRectangleInHistogram.largestRectangleArea(heights);

        // then
        assertEquals(9, result);
    }

    @Test
    void givenMixedBars_whenCalculateMaxArea_thenCorrect() {
        // given
        int[] heights = {2, 1, 5, 6, 2, 3};

        // when
        int result = LargestRectangleInHistogram.largestRectangleArea(heights);

        // then
        assertEquals(10, result);
    }

    @Test
    void givenEmptyArray_whenCalculateMaxArea_thenZero() {
        // given
        int[] heights = {};

        // when
        int result = LargestRectangleInHistogram.largestRectangleArea(heights);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenAllSameHeight_whenCalculateMaxArea_thenCorrect() {
        // given
        int[] heights = {2, 2, 2, 2};

        // when
        int result = LargestRectangleInHistogram.largestRectangleArea(heights);

        // then
        assertEquals(8, result);
    }
}