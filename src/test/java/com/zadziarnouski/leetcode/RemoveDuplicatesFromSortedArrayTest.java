package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void shouldReturnZero_whenArrayIsEmpty() {
        // Given
        int[] nums = {};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(0, k);
        assertArrayEquals(new int[]{}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldReturnOne_whenArrayHasSingleElement() {
        // Given
        int[] nums = {7};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(1, k);
        assertArrayEquals(new int[]{7}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldKeepUnique_whenNoDuplicates() {
        // Given
        int[] nums = {1, 2, 3, 4};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(4, k);
        assertArrayEquals(new int[]{1, 2, 3, 4}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldRemoveAllButOne_whenAllEqual() {
        // Given
        int[] nums = {5, 5, 5, 5, 5};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(1, k);
        assertArrayEquals(new int[]{5}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldRemoveDuplicates_whenMixed() {
        // Given
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(5, k);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldWorkWithNegatives_andZeros() {
        // Given
        int[] nums = {-3, -3, -1, -1, 0, 0, 0, 2, 2};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(4, k);
        assertArrayEquals(new int[]{-3, -1, 0, 2}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldHandleTwoElements_withDuplicate() {
        // Given
        int[] nums = {9, 9};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(1, k);
        assertArrayEquals(new int[]{9}, Arrays.copyOf(nums, k));
    }

    @Test
    void shouldHandleTwoElements_withoutDuplicate() {
        // Given
        int[] nums = {9, 10};

        // When
        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        // Then
        assertEquals(2, k);
        assertArrayEquals(new int[]{9, 10}, Arrays.copyOf(nums, k));
    }

}