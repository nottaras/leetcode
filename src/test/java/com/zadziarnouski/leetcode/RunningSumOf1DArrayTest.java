package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1DArrayTest {

    @Test
    void givenSimpleArray_whenRunningSum_thenReturnCumulativeSums() {
        // given
        int[] input = {1, 2, 3, 4};

        // when
        int[] result = RunningSumOf1DArray.runningSum(input);

        // then
        assertArrayEquals(new int[]{1, 3, 6, 10}, result);
    }

    @Test
    void givenArrayWithSingleElement_whenRunningSum_thenReturnSameElement() {
        // given
        int[] input = {5};

        // when
        int[] result = RunningSumOf1DArray.runningSum(input);

        // then
        assertArrayEquals(new int[]{5}, result);
    }

    @Test
    void givenArrayWithZeros_whenRunningSum_thenReturnZeros() {
        // given
        int[] input = {0, 0, 0, 0};

        // when
        int[] result = RunningSumOf1DArray.runningSum(input);

        // then
        assertArrayEquals(new int[]{0, 0, 0, 0}, result);
    }

    @Test
    void givenArrayWithNegativeNumbers_whenRunningSum_thenReturnCorrectSums() {
        // given
        int[] input = {-1, 2, -3, 4};

        // when
        int[] result = RunningSumOf1DArray.runningSum(input);

        // then
        assertArrayEquals(new int[]{-1, 1, -2, 2}, result);
    }
}