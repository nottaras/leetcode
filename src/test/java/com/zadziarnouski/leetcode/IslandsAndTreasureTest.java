package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IslandsAndTreasureTest {

    @Test
    void givenGridWithNoGates_whenProcessed_thenGridUnchanged() {
        // Given
        int INF = Integer.MAX_VALUE;
        int[][] input = {
                {INF, -1},
                {INF, INF}
        };
        int[][] expected = {
                {INF, -1},
                {INF, INF}
        };

        // When
        IslandsAndTreasure.solution(input);

        // Then
        assertArrayEquals(expected, input);
    }

    @Test
    void givenGridWithOneGate_whenProcessed_thenDistancesUpdated() {
        // Given
        int INF = Integer.MAX_VALUE;
        int[][] input = {
                {INF, -1,  0,  INF},
                {INF, INF, INF, -1},
                {INF, -1,  INF, -1},
                {0,   -1,  INF, INF}
        };
        int[][] expected = {
                {3,  -1,  0,  1},
                {2,   2,  1, -1},
                {1,  -1,  2, -1},
                {0,  -1,  3,  4}
        };

        // When
        IslandsAndTreasure.solution(input);

        // Then
        assertTrue(Arrays.deepEquals(expected, input));
    }

    @Test
    void givenOnlyWallsAndGates_whenProcessed_thenNoChange() {
        // Given
        int[][] input = {
                {-1, 0},
                {0, -1}
        };
        int[][] expected = {
                {-1, 0},
                {0, -1}
        };

        // When
        IslandsAndTreasure.solution(input);

        // Then
        assertArrayEquals(expected, input);
    }
}