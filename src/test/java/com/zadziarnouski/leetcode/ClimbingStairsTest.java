package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @Test
    void shouldReturn1_whenNIs1() {
        // Given
        int n = 1;

        // When
        int result = ClimbingStairs.climbStairs(n);

        // Then
        assertEquals(1, result);
    }

    @Test
    void shouldReturn2_whenNIs2() {
        // Given
        int n = 2;

        // When
        int result = ClimbingStairs.climbStairs(n);

        // Then
        assertEquals(2, result);
    }

    @Test
    void shouldReturn3_whenNIs3() {
        // Given
        int n = 3;

        // When
        int result = ClimbingStairs.climbStairs(n);

        // Then
        assertEquals(3, result);
    }

    @Test
    void shouldReturn5_whenNIs4() {
        // Given
        int n = 4;

        // When
        int result = ClimbingStairs.climbStairs(n);

        // Then
        assertEquals(5, result);
    }

    @Test
    void shouldReturn8_whenNIs5() {
        // Given
        int n = 5;

        // When
        int result = ClimbingStairs.climbStairs(n);

        // Then
        assertEquals(8, result);
    }

    @Test
    void shouldReturn1836311903_whenNIs45() {
        // Given
        int n = 45;

        // When
        int result = ClimbingStairs.climbStairs(n);

        // Then
        assertEquals(1836311903, result);
    }
}