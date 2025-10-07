package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest {

    @Test
    void givenThreeSteps_whenMinCostClimbingStairs_thenReturn15() {
        // given
        int[] cost = {10, 15, 20};

        // when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);

        // then
        assertEquals(15, result);
    }

    @Test
    void givenTwoSteps_whenMinCostClimbingStairs_thenReturnMin() {
        // given
        int[] cost = {1, 100};

        // when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);

        // then
        assertEquals(1, result);
    }

    @Test
    void givenLongerCostArray_whenMinCostClimbingStairs_thenReturnOptimal() {
        // given
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        // when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);

        // then
        assertEquals(6, result);
    }

    @Test
    void givenEqualCosts_whenMinCostClimbingStairs_thenReturnSumOfCheapestPath() {
        // given
        int[] cost = {5, 5, 5, 5};

        // when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);

        // then
        assertEquals(10, result);
    }

    @Test
    void givenZeroCosts_whenMinCostClimbingStairs_thenReturnZero() {
        // given
        int[] cost = {0, 0, 0, 0};

        // when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);

        // then
        assertEquals(0, result);
    }
}
