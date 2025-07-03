package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @Test
    void shouldReturn1_whenNIs1() {
        // Given
        ClimbingStairs solver = new ClimbingStairs();

        // When & Then
        assertEquals(1, solver.climbStairs(1));
    }

    @Test
    void shouldReturn2_whenNIs2() {
        // Given
        ClimbingStairs solver = new ClimbingStairs();

        // When & Then
        assertEquals(2, solver.climbStairs(2));
    }

    @Test
    void shouldReturn3_whenNIs3() {
        // Given
        ClimbingStairs solver = new ClimbingStairs();

        // When & Then
        assertEquals(3, solver.climbStairs(3));
    }

    @Test
    void shouldReturn5_whenNIs4() {
        // Given
        ClimbingStairs solver = new ClimbingStairs();

        // When & Then
        assertEquals(5, solver.climbStairs(4));
    }

    @Test
    void shouldReturn8_whenNIs5() {
        // Given
        ClimbingStairs solver = new ClimbingStairs();

        // When & Then
        assertEquals(8, solver.climbStairs(5));
    }

    @Test
    void shouldReturn1836311903_whenNIs45() {
        // Given
        ClimbingStairs solver = new ClimbingStairs();

        // When & Then
        assertEquals(1836311903, solver.climbStairs(45));
    }
}