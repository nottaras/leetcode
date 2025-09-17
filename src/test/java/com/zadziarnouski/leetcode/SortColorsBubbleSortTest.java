package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsBubbleSortTest {

    @Test
    void givenUnsortedColors_whenSortColors_thenSortedCorrectly() {
        // given
        int[] nums = {2, 0, 2, 1, 1, 0};

        // when
        SortColors.bubbleSort(nums);

        // then
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    void givenAlreadySortedColors_whenSortColors_thenNoChange() {
        // given
        int[] nums = {0, 0, 1, 1, 2, 2};

        // when
        SortColors.bubbleSort(nums);

        // then
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    void givenSingleElement_whenSortColors_thenNoChange() {
        // given
        int[] nums = {1};

        // when
        SortColors.bubbleSort(nums);

        // then
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void givenAllSameElements_whenSortColors_thenNoChange() {
        // given
        int[] nums = {2, 2, 2};

        // when
        SortColors.bubbleSort(nums);

        // then
        assertArrayEquals(new int[]{2, 2, 2}, nums);
    }

    @Test
    void givenEmptyArray_whenSortColors_thenStillEmpty() {
        // given
        int[] nums = {};

        // when
        SortColors.bubbleSort(nums);

        // then
        assertArrayEquals(new int[]{}, nums);
    }
}
