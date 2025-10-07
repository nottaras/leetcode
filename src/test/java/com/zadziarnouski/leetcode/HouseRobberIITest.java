package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberIITest {

    @Test
    void givenEmptyArray_whenRob_thenReturnZero() {
        // Given
        int[] houses = {};

        // When
        int result = HouseRobberII.rob(houses);

        // Then
        assertEquals(0, result);
    }

    @Test
    void givenSingleHouse_whenRob_thenReturnItsValue() {
        // Given
        int[] houses = {5};

        // When
        int result = HouseRobberII.rob(houses);

        // Then
        assertEquals(5, result);
    }

    @Test
    void givenTwoHouses_whenRob_thenReturnMaxValue() {
        // Given
        int[] houses = {2, 3};

        // When
        int result = HouseRobberII.rob(houses);

        // Then
        assertEquals(3, result);
    }

    @Test
    void givenThreeHousesInCircle_whenRob_thenReturnMaxAvoidingFirstAndLastTogether() {
        // Given
        int[] houses = {2, 3, 2};

        // When
        int result = HouseRobberII.rob(houses);

        // Then
        assertEquals(3, result);
    }

    @Test
    void givenMultipleHouses_whenRob_thenReturnMaxAmount() {
        // Given
        int[] houses = {1, 2, 3, 1};

        // When
        int result = HouseRobberII.rob(houses);

        // Then
        assertEquals(4, result);
    }

    @Test
    void givenLargeInput_whenRob_thenReturnCorrectMaxValue() {
        // Given
        int[] houses = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        // When
        int result = HouseRobberII.rob(houses);

        // Then
        assertEquals(16, result);
    }
}