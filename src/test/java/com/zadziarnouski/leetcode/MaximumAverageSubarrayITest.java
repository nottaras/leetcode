package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayITest {

    @Test
    void shouldReturnMaximumAverage_whenBasicCase() {
        // Given
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        // When
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // Then
        assertEquals(12.75, result, 0.00001);
    }

    @Test
    void shouldReturnAverage_whenArraySizeEqualsK() {
        // Given
        int[] nums = {5, 5, 5, 5};
        int k = 4;

        // When
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // Then
        assertEquals(5.0, result, 0.00001);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        // Given
        int[] nums = {-1, -12, -5, -6, -50, -3};
        int k = 2;

        // When
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // Then
        assertEquals(-5.5, result, 0.00001);
    }

    @Test
    void shouldReturnSingleElementAverage_whenKIs1() {
        // Given
        int[] nums = {2, 4, 6, 8};
        int k = 1;

        // When
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        // Then
        assertEquals(8.0, result, 0.00001);
    }
}
