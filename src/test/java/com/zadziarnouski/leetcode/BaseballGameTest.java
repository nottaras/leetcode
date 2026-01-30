package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseballGameTest {

    @Test
    void shouldCalculateScore_whenSimpleOperationsProvided() {
        // Given
        String[] operations = {"5", "2", "C", "D", "+"};

        // When
        int result = BaseballGame.calPoints(operations);

        // Then
        assertEquals(30, result);
    }

    @Test
    void shouldCalculateScore_whenMultipleAddOperationsUsed() {
        // Given
        String[] operations = {"5", "-2", "4", "C", "D", "9", "+", "+"};

        // When
        int result = BaseballGame.calPoints(operations);

        // Then
        assertEquals(27, result);
    }

    @Test
    void shouldHandleOnlyNumbers() {
        // Given
        String[] operations = {"1", "2", "3", "4"};

        // When
        int result = BaseballGame.calPoints(operations);

        // Then
        assertEquals(10, result);
    }

    @Test
    void shouldHandleConsecutiveCancels() {
        // Given
        String[] operations = {"5", "3", "C", "C", "10"};

        // When
        int result = BaseballGame.calPoints(operations);

        // Then
        assertEquals(10, result);
    }

    @Test
    void shouldHandleSingleOperation() {
        // Given
        String[] operations = {"7"};

        // When
        int result = BaseballGame.calPoints(operations);

        // Then
        assertEquals(7, result);
    }
}