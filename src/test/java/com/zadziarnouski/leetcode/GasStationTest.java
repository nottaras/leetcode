package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    @Test
    void shouldReturnStartIndex_WhenSolutionExists() {
        // given
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        // when
        int result = GasStation.canCompleteCircuit(gas, cost);

        // then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnMinusOne_WhenNoSolutionExists() {
        // given
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};

        // when
        int result = GasStation.canCompleteCircuit(gas, cost);

        // then
        assertEquals(-1, result);
    }

    @Test
    void shouldReturnZero_WhenOnlyOneStationAndItWorks() {
        // given
        int[] gas = {5};
        int[] cost = {4};

        // when
        int result = GasStation.canCompleteCircuit(gas, cost);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnMinusOne_WhenOnlyOneStationAndNotEnoughGas() {
        // given
        int[] gas = {1};
        int[] cost = {2};

        // when
        int result = GasStation.canCompleteCircuit(gas, cost);

        // then
        assertEquals(-1, result);
    }

    @Test
    void shouldHandleMultipleValidStarts_ButReturnFirstPossible() {
        // given
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};

        // when
        int result = GasStation.canCompleteCircuit(gas, cost);

        // then
        assertEquals(4, result);
    }

}