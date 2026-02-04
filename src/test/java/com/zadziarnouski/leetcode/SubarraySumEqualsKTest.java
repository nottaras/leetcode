package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumEqualsKTest {

    @Test
    void shouldCountSubarrays_whenSimplePositiveNumbers() {
        // Given
        int[] nums = {1, 1, 1};
        int k = 2;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        assertEquals(2, result);
    }

    @Test
    void shouldReturnZero_whenNoSubarrayMatches() {
        // Given
        int[] nums = {1, 2, 3};
        int k = 7;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        assertEquals(0, result);
    }

    @Test
    void shouldHandleSubarraysStartingFromIndexZero() {
        // Given
        int[] nums = {3, 4, 7};
        int k = 7;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        // [3,4] and [7]
        assertEquals(2, result);
    }

    @Test
    void shouldHandleNegativeNumbersCorrectly() {
        // Given
        int[] nums = {1, -1, 1};
        int k = 1;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        // [1], [1,-1,1], [1]
        assertEquals(3, result);
    }

    @Test
    void shouldHandleZeroTargetWithZeroValues() {
        // Given
        int[] nums = {0, 0, 0};
        int k = 0;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        // all subarrays are valid
        assertEquals(6, result);
    }

    @Test
    void shouldHandleSingleElementArray_whenElementMatchesK() {
        // Given
        int[] nums = {5};
        int k = 5;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        assertEquals(1, result);
    }

    @Test
    void shouldHandleSingleElementArray_whenElementDoesNotMatchK() {
        // Given
        int[] nums = {5};
        int k = 3;

        // When
        int result = SubarraySumEqualsK.subarraySum(nums, k);

        // Then
        assertEquals(0, result);
    }
}