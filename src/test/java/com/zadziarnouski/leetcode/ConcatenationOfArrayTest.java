package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcatenationOfArrayTest {

    @Test
    void shouldReturnConcatenatedArray_whenInputIsSingleElement() {
        // given
        int[] nums = {1};

        // when
        int[] result = ConcatenationOfArray.getConcatenation(nums);

        // then
        assertArrayEquals(new int[]{1, 1}, result);
    }

    @Test
    void shouldReturnConcatenatedArray_whenInputIsMultipleElements() {
        // given
        int[] nums = {1, 2, 3};

        // when
        int[] result = ConcatenationOfArray.getConcatenation(nums);

        // then
        assertArrayEquals(new int[]{1, 2, 3, 1, 2, 3}, result);
    }

    @Test
    void shouldReturnEmptyArray_whenInputIsEmpty() {
        // given
        int[] nums = {};

        // when
        int[] result = ConcatenationOfArray.getConcatenation(nums);

        // then
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        // given
        int[] nums = {-1, -2};

        // when
        int[] result = ConcatenationOfArray.getConcatenation(nums);

        // then
        assertArrayEquals(new int[]{-1, -2, -1, -2}, result);
    }
}