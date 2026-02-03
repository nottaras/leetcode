package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    @Test
    void shouldFindMissingNumber_whenMissingInTheMiddle() {
        // Given
        int[] nums = {3, 0, 1};

        // When
        int result = MissingNumber.missingNumber(nums);

        // Then
        assertEquals(2, result);
    }

    @Test
    void shouldFindMissingNumber_whenMissingIsZero() {
        // Given
        int[] nums = {1, 2, 3};

        // When
        int result = MissingNumber.missingNumber(nums);

        // Then
        assertEquals(0, result);
    }

    @Test
    void shouldFindMissingNumber_whenMissingIsN() {
        // Given
        int[] nums = {0, 1, 2};

        // When
        int result = MissingNumber.missingNumber(nums);

        // Then
        assertEquals(3, result);
    }

    @Test
    void shouldHandleSingleElementArray_whenZeroIsMissing() {
        // Given
        int[] nums = {1};

        // When
        int result = MissingNumber.missingNumber(nums);

        // Then
        assertEquals(0, result);
    }

    @Test
    void shouldHandleSingleElementArray_whenOneIsMissing() {
        // Given
        int[] nums = {0};

        // When
        int result = MissingNumber.missingNumber(nums);

        // Then
        assertEquals(1, result);
    }

    @Test
    void shouldHandleLargerArray() {
        // Given
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        // When
        int result = MissingNumber.missingNumber(nums);

        // Then
        assertEquals(8, result);
    }
}