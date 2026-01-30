package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

    @Test
    void shouldShuffleArray_whenValidInputProvided() {
        // Given
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        // When
        int[] result = ShuffleTheArray.shuffle(nums, n);

        // Then
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, result);
    }

    @Test
    void shouldHandleMinimumSizeArray() {
        // Given
        int[] nums = {1, 2};
        int n = 1;

        // When
        int[] result = ShuffleTheArray.shuffle(nums, n);

        // Then
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldHandleZerosCorrectly() {
        // Given
        int[] nums = {0, 0, 0, 0};
        int n = 2;

        // When
        int[] result = ShuffleTheArray.shuffle(nums, n);

        // Then
        assertArrayEquals(new int[]{0, 0, 0, 0}, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        // Given
        int[] nums = {-1, -2, -3, -4};
        int n = 2;

        // When
        int[] result = ShuffleTheArray.shuffle(nums, n);

        // Then
        assertArrayEquals(new int[]{-1, -3, -2, -4}, result);
    }
}
