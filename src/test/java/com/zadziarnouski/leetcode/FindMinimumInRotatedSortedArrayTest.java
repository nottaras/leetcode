package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    @Test
    void shouldFindMinimumInRotatedArray_Example1() {
        // given
        int[] nums = {3, 4, 5, 1, 2};

        // when
        int result = FindMinimumInRotatedSortedArray.findMin(nums);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldFindMinimumInRotatedArray_Example2() {
        // given
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        // when
        int result = FindMinimumInRotatedSortedArray.findMin(nums);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldHandleSingleElementArray() {
        // given
        int[] nums = {1};

        // when
        int result = FindMinimumInRotatedSortedArray.findMin(nums);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldHandleSortedArrayWithoutRotation() {
        // given
        int[] nums = {1, 2, 3, 4, 5};

        // when
        int result = FindMinimumInRotatedSortedArray.findMin(nums);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldHandleTwoElementsRotated() {
        // given
        int[] nums = {2, 1};

        // when
        int result = FindMinimumInRotatedSortedArray.findMin(nums);

        // then
        assertEquals(1, result);
    }
}