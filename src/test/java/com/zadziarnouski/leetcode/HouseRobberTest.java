package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {

    @Test
    void givenEmptyArray_whenRob_thenReturnZero() {
        // Given
        int[] nums = {};

        // When
        int result = HouseRobber.rob(nums);

        // Then
        assertEquals(0, result);
    }

    @Test
    void givenSingleHouse_whenRob_thenReturnItsValue() {
        // Given
        int[] nums = {5};

        // When
        int result = HouseRobber.rob(nums);

        // Then
        assertEquals(5, result);
    }

    @Test
    void givenTwoHouses_whenRob_thenReturnMaxValue() {
        // Given
        int[] nums = {2, 3};

        // When
        int result = HouseRobber.rob(nums);

        // Then
        assertEquals(3, result);
    }

    @Test
    void givenMultipleHouses_whenRob_thenReturnMaxLoot() {
        // Given
        int[] nums = {2, 7, 9, 3, 1};

        // When
        int result = HouseRobber.rob(nums);

        // Then
        assertEquals(12, result);
    }

    @Test
    void givenIncreasingValues_whenRob_thenReturnMaxLoot() {
        // Given
        int[] nums = {1, 2, 3, 1};

        // When
        int result = HouseRobber.rob(nums);

        // Then
        assertEquals(4, result);
    }
}