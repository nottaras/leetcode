package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {

    @Test
    void givenSimpleBoard_whenSolve_thenSurroundedRegionsAreCaptured() {
        // Given
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        // When
        SurroundedRegions.solve(board);

        // Then
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void givenBoardWithNoSurrounded_whenSolve_thenBoardRemainsUnchanged() {
        // Given
        char[][] board = {
                {'O', 'O'},
                {'O', 'O'}
        };

        // When
        SurroundedRegions.solve(board);

        // Then
        char[][] expected = {
                {'O', 'O'},
                {'O', 'O'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    void givenBoardWithAllX_whenSolve_thenBoardRemainsUnchanged() {
        // Given
        char[][] board = {
                {'X', 'X'},
                {'X', 'X'}
        };

        // When
        SurroundedRegions.solve(board);

        // Then
        char[][] expected = {
                {'X', 'X'},
                {'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }
}