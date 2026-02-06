package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    @Test
    void shouldReverseEvenLengthArray() {
        // Given
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        // When
        ReverseString.reverseString(input);

        // Then
        assertArrayEquals(expected, input);
    }

    @Test
    void shouldReverseOddLengthArray() {
        // Given
        char[] input = {'a', 'b', 'c'};
        char[] expected = {'c', 'b', 'a'};

        // When
        ReverseString.reverseString(input);

        // Then
        assertArrayEquals(expected, input);
    }

    @Test
    void shouldHandleSingleCharacter() {
        // Given
        char[] input = {'x'};
        char[] expected = {'x'};

        // When
        ReverseString.reverseString(input);

        // Then
        assertArrayEquals(expected, input);
    }

    @Test
    void shouldHandleEmptyArray() {
        // Given
        char[] input = {};
        char[] expected = {};

        // When
        ReverseString.reverseString(input);

        // Then
        assertArrayEquals(expected, input);
    }

    @Test
    void shouldReverseArrayWithSpecialCharacters() {
        // Given
        char[] input = {'a', '#', '1', '!'};
        char[] expected = {'!', '1', '#', 'a'};

        // When
        ReverseString.reverseString(input);

        // Then
        assertArrayEquals(expected, input);
    }
}