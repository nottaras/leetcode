package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    @Test
    void shouldMoveZeroesToTheEnd_preservingOrderOfNonZeroElements() {
        // Given
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }

    @Test
    void shouldHandleArrayWithoutZeroes() {
        // Given
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }

    @Test
    void shouldHandleArrayWithOnlyZeroes() {
        // Given
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }

    @Test
    void shouldHandleSingleElementZero() {
        // Given
        int[] nums = {0};
        int[] expected = {0};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }

    @Test
    void shouldHandleSingleElementNonZero() {
        // Given
        int[] nums = {5};
        int[] expected = {5};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }

    @Test
    void shouldHandleZeroesAlreadyAtTheEnd() {
        // Given
        int[] nums = {1, 2, 3, 0, 0};
        int[] expected = {1, 2, 3, 0, 0};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }

    @Test
    void shouldHandleInterleavedZeroes() {
        // Given
        int[] nums = {0, 0, 1, 0, 2, 0, 3};
        int[] expected = {1, 2, 3, 0, 0, 0, 0};

        // When
        MoveZeroes.moveZeroes(nums);

        // Then
        assertArrayEquals(expected, nums);
    }
}