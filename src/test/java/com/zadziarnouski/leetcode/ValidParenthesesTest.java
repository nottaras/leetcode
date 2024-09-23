package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.ValidParentheses.isValid;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    void shouldReturnTrueForValidParentheses() {
        // Given
        String given = "()";

        // When & Then
        assertTrue(isValid(given));
    }

    @Test
    void shouldReturnTrueForNestedValidParentheses() {
        // Given
        String given = "(())";

        // When & Then
        assertTrue(isValid(given));
    }

    @Test
    void shouldReturnFalseForUnmatchedClosingParenthesis() {
        // Given
        String given = "(()";

        // When & Then
        assertFalse(isValid(given));
    }

    @Test
    void shouldReturnFalseForInvalidOrder() {
        // Given
        String given = "())(";

        // When & Then
        assertFalse(isValid(given));
    }

    @Test
    void shouldReturnTrueForEmptyString() {
        // Given
        String given = "";

        // When & Then
        assertTrue(isValid(given));
    }

    @Test
    void shouldReturnFalseForSingleClosingParenthesis() {
        // Given
        String given = ")";

        // When & Then
        assertFalse(isValid(given));
    }

    @Test
    void shouldReturnFalseForMultipleUnmatchedParentheses() {
        // Given
        String given = "(((((";

        // When & Then
        assertFalse(isValid(given));
    }

    @Test
    void shouldReturnTrueForComplexValidParentheses() {
        // Given
        String given = "((()))()";

        // When & Then
        assertTrue(isValid(given));
    }
}