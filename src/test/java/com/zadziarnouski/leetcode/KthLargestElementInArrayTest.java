package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInArrayTest {

    @Test
    void shouldReturnKthLargestElement_basicCase() {
        // given
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // when
        int result = KthLargestElementInArray.findKthLargest(nums, k);

        // then
        assertEquals(5, result);
    }

    @Test
    void shouldReturnKthLargestElement_singleElement() {
        // given
        int[] nums = {1};
        int k = 1;

        // when
        int result = KthLargestElementInArray.findKthLargest(nums, k);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldReturnKthLargestElement_withDuplicates() {
        // given
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        // when
        int result = KthLargestElementInArray.findKthLargest(nums, k);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnKthLargestElement_negativeNumbers() {
        // given
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 2;

        // when
        int result = KthLargestElementInArray.findKthLargest(nums, k);

        // then
        assertEquals(-2, result);
    }
}