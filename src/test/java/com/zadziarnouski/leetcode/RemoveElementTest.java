package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.util.ArrayUtil.assertFirstKDoesNotContain;
import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void shouldRemoveAllOccurrences_whenElementExistsMultipleTimes() {
        // Given
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        // When
        int k = RemoveElement.removeElement(nums, val);

        // Then
        assertEquals(2, k);
        assertFirstKDoesNotContain(nums, k, val);
    }

    @Test
    void shouldRemoveNothing_whenElementDoesNotExist() {
        // Given
        int[] nums = {1, 2, 3, 4};
        int val = 5;

        // When
        int k = RemoveElement.removeElement(nums, val);

        // Then
        assertEquals(4, k);
        assertFirstKDoesNotContain(nums, k, val);
    }

    @Test
    void shouldReturnZero_whenAllElementsAreRemoved() {
        // Given
        int[] nums = {7, 7, 7};
        int val = 7;

        // When
        int k = RemoveElement.removeElement(nums, val);

        // Then
        assertEquals(0, k);
    }

    @Test
    void shouldHandleSingleElementEqualToVal() {
        // Given
        int[] nums = {1};
        int val = 1;

        // When
        int k = RemoveElement.removeElement(nums, val);

        // Then
        assertEquals(0, k);
    }

    @Test
    void shouldHandleSingleElementNotEqualToVal() {
        // Given
        int[] nums = {1};
        int val = 2;

        // When
        int k = RemoveElement.removeElement(nums, val);

        // Then
        assertEquals(1, k);
        assertEquals(1, nums[0]);
    }

    @Test
    void shouldHandleEmptyArray() {
        // Given
        int[] nums = {};
        int val = 1;

        // When
        int k = RemoveElement.removeElement(nums, val);

        // Then
        assertEquals(0, k);
    }
}