package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddBinaryTest {

    @Test
    void shouldReturnSum_whenNoCarry() {
        // Given
        String a = "0";
        String b = "0";

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("0", result);
    }

    @Test
    void shouldReturnSum_whenSimpleCarryOccurs() {
        // Given
        String a = "1";
        String b = "1";

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("10", result);
    }

    @Test
    void shouldReturnSum_whenDifferentLengths_noCarryCascade() {
        // Given
        String a = "1010";
        String b = "1";

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("1011", result);
    }

    @Test
    void shouldReturnSum_whenDifferentLengths_withCarryCascade() {
        // Given
        String a = "1111";
        String b = "1";

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("10000", result);
    }

    @Test
    void shouldReturnSum_whenMultipleCarriesInside() {
        // Given
        String a = "1010";
        String b = "1011";

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("10101", result);
    }

    @Test
    void shouldReturnSum_whenOneOperandIsZero() {
        // Given
        String a = "0";
        String b = "101101";

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("101101", result);
    }

    @Test
    void shouldReturnSum_whenBothOperandsLarge() {
        // Given
        String a = "1000000000000000000000001";
        String b = "111";
        // 1000000000000000000010000 +  (actually do it via method expectation)
        // Expected: 1000000000000000000001000 (carry ripples over the tail 001 + 111 -> 1000)
        // Let's compute precisely: ...0000001 + 111 = ...001000
        // So final: "1000000000000000000001000"

        // When
        String result = AddBinary.addBinary(a, b);

        // Then
        assertEquals("1000000000000000000001000", result);
    }

}