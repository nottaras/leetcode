package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TwoSumIIInputArrayIsSortedTest {

    @Test
    void shouldReturnIndices_whenTargetExists() {
        // given
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        // when
        int[] result = TwoSumIIInputArrayIsSorted.twoSum(numbers, target);

        // then
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldReturnIndices_whenTargetIsSumOfLastTwo() {
        // given
        int[] numbers = {1, 2, 3, 4, 6};
        int target = 10;

        // when
        int[] result = TwoSumIIInputArrayIsSorted.twoSum(numbers, target);

        // then
        assertArrayEquals(new int[]{4, 5}, result);
    }

    @Test
    void shouldReturnIndices_whenOnlyTwoElements() {
        // given
        int[] numbers = {2, 3};
        int target = 5;

        // when
        int[] result = TwoSumIIInputArrayIsSorted.twoSum(numbers, target);

        // then
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldReturnNullOrEmpty_whenNoSolutionExists() {
        // given
        int[] numbers = {1, 2, 3};
        int target = 10;

        // when
        int[] result = TwoSumIIInputArrayIsSorted.twoSum(numbers, target);

        // then
        assertNull(result); // или assertArrayEquals(new int[0], result);
    }

}