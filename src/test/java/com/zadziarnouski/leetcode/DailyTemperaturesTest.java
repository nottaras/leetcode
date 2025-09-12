package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {

    @Test
    void givenIncreasingTemperatures_whenCalculate_thenReturnCorrectWaits() {
        int[] input = {70, 71, 72, 73};
        int[] expected = {1, 1, 1, 0};
        assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(input));
    }

    @Test
    void givenDecreasingTemperatures_whenCalculate_thenReturnZeros() {
        int[] input = {75, 74, 73, 72};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(input));
    }

    @Test
    void givenMixedTemperatures_whenCalculate_thenReturnCorrectWaits() {
        int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(input));
    }

    @Test
    void givenAllSameTemperatures_whenCalculate_thenReturnZeros() {
        int[] input = {70, 70, 70, 70};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(input));
    }

    @Test
    void givenSingleElement_whenCalculate_thenReturnZero() {
        int[] input = {70};
        int[] expected = {0};
        assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(input));
    }

    @Test
    void givenEmptyArray_whenCalculate_thenReturnEmpty() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, DailyTemperatures.dailyTemperatures(input));
    }
}