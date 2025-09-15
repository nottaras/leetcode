package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    @Test
    void givenRotatedArray_whenTargetExists_thenReturnCorrectIndex() {
        // given
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // when
        int result = SearchInRotatedSortedArray.search(nums, target);

        // then
        assertEquals(4, result);
    }

    @Test
    void givenRotatedArray_whenTargetDoesNotExist_thenReturnMinusOne() {
        // given
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        // when
        int result = SearchInRotatedSortedArray.search(nums, target);

        // then
        assertEquals(-1, result);
    }

    @Test
    void givenNonRotatedArray_whenTargetExists_thenReturnCorrectIndex() {
        // given
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;

        // when
        int result = SearchInRotatedSortedArray.search(nums, target);

        // then
        assertEquals(2, result);
    }

    @Test
    void givenSingleElementArray_whenTargetExists_thenReturnZero() {
        // given
        int[] nums = {1};
        int target = 1;

        // when
        int result = SearchInRotatedSortedArray.search(nums, target);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenSingleElementArray_whenTargetDoesNotExist_thenReturnMinusOne() {
        // given
        int[] nums = {1};
        int target = 0;

        // when
        int result = SearchInRotatedSortedArray.search(nums, target);

        // then
        assertEquals(-1, result);
    }

    @Test
    void givenTwoElementArray_whenTargetExists_thenReturnCorrectIndex() {
        // given
        int[] nums = {2, 1};
        int target = 1;

        // when
        int result = SearchInRotatedSortedArray.search(nums, target);

        // then
        assertEquals(1, result);
    }
}