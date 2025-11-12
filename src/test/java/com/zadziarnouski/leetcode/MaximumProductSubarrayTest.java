package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

    @Test
    void shouldReturnMaximumProductForPositiveAndNegativeNumbers() {
        // given
        int[] nums = {2, 3, -2, 4};

        // when
        int result = MaximumProductSubarray.maxProduct(nums);

        // then
        assertEquals(6, result);
    }

    @Test
    void shouldHandleAllNegativeNumbers() {
        // given
        int[] nums = {-2, -3, -4};

        // when
        int result = MaximumProductSubarray.maxProduct(nums);

        // then
        assertEquals(12, result);
    }

    @Test
    void shouldHandleSingleElementArray() {
        // given
        int[] nums = {-2};

        // when
        int result = MaximumProductSubarray.maxProduct(nums);

        // then
        assertEquals(-2, result);
    }

    @Test
    void shouldHandleZeroInArray() {
        // given
        int[] nums = {-2, 0, -1};

        // when
        int result = MaximumProductSubarray.maxProduct(nums);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnProductForMixedSigns() {
        // given
        int[] nums = {2, -5, -2, -4, 3};

        // when
        int result = MaximumProductSubarray.maxProduct(nums);

        // then
        assertEquals(24, result);
    }
}
