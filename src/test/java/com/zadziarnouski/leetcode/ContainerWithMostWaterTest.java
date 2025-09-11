package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    @Test
    void shouldReturnMaxArea_whenBasicCase() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(49, result);
    }

    @Test
    void shouldReturnZero_whenLessThanTwoLines() {
        int[] height = {5};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnMaxArea_whenTwoLinesOnly() {
        int[] height = {1, 1};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(1, result);
    }

    @Test
    void shouldReturnMaxArea_whenAllHeightsSame() {
        int[] height = {5, 5, 5, 5, 5};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(20, result); // 5 * (last - first) = 5 * 4
    }

    @Test
    void shouldReturnMaxArea_whenDecreasingHeights() {
        int[] height = {5, 4, 3, 2, 1};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(6, result); // between 5 and 2
    }
}