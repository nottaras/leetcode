package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    void shouldReturnFalse_whenArrayIsEmpty() {
        // Given
        int[] nums = {};

        // When
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalse_whenArrayHasOneElement() {
        // Given
        int[] nums = {42};

        // When
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalse_whenAllElementsAreUnique() {
        // Given
        int[] nums = {1, 2, 3, 4, 5};

        // When
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrue_whenThereAreDuplicates() {
        // Given
        int[] nums = {1, 2, 3, 2};

        // When
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        // Then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrue_whenAllElementsAreSame() {
        // Given
        int[] nums = {7, 7, 7, 7};

        // When
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        // Then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrue_whenDuplicateIsAtStartAndEnd() {
        // Given
        int[] nums = {5, 1, 2, 3, 5};

        // When
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        // Then
        assertTrue(result);
    }

}