package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {

    @Test
    void givenMixedNumbers_whenFindMaxSubarray_thenCorrectResult() {
        // Given
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // When
        int result = MaximumSubarray.maxSubArray(nums);

        // Then
        assertEquals(6, result); // [4, -1, 2, 1]
    }

    @Test
    void givenAllNegativeNumbers_whenFindMaxSubarray_thenSingleLargest() {
        int[] nums = {-8, -3, -6, -2, -5, -4};
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals(-2, result);
    }

    @Test
    void givenAllPositiveNumbers_whenFindMaxSubarray_thenSumAll() {
        int[] nums = {2, 3, 1, 5};
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals(11, result);
    }

    @Test
    void givenSingleElement_whenFindMaxSubarray_thenSameElement() {
        int[] nums = {5};
        int result = MaximumSubarray.maxSubArray(nums);
        assertEquals(5, result);
    }
}