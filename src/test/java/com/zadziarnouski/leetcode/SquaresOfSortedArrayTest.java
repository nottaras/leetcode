package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {
    @Test
    void shouldHandleMixedNegativeAndPositiveNumbers() {
        // Given
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};

        // When
        int[] result = SquaresOfSortedArray.sortedSquares(nums);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldHandleAllNegativeNumbers() {
        // Given
        int[] nums = {-7, -3, -1};
        int[] expected = {1, 9, 49};

        // When
        int[] result = SquaresOfSortedArray.sortedSquares(nums);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldHandleAllPositiveNumbers() {
        // Given
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};

        // When
        int[] result = SquaresOfSortedArray.sortedSquares(nums);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldHandleSingleElement() {
        // Given
        int[] nums = {-5};
        int[] expected = {25};

        // When
        int[] result = SquaresOfSortedArray.sortedSquares(nums);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldHandleZerosOnly() {
        // Given
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};

        // When
        int[] result = SquaresOfSortedArray.sortedSquares(nums);

        // Then
        assertArrayEquals(expected, result);
    }

    @Test
    void shouldHandleLargeAbsoluteValuesAtEdges() {
        // Given
        int[] nums = {-10000, -5000, 0, 2, 3};
        int[] expected = {0, 4, 9, 25_000_000, 100_000_000};

        // When
        int[] result = SquaresOfSortedArray.sortedSquares(nums);

        // Then
        assertArrayEquals(expected, result);
    }
}