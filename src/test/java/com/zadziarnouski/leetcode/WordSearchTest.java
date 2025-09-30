package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void givenBoard_whenWordExists_thenReturnTrue() {
        // Given
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";

        // When
        boolean result = WordSearch.exist(board, word);

        // Then
        assertTrue(result);
    }

    @Test
    void givenBoard_whenWordDoesNotExist_thenReturnFalse() {
        // Given
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCB";

        // When
        boolean result = WordSearch.exist(board, word);

        // Then
        assertFalse(result);
    }

    @Test
    void givenSingleCellBoard_whenWordMatches_thenReturnTrue() {
        // Given
        char[][] board = {
                {'A'}
        };
        String word = "A";

        // When
        boolean result = WordSearch.exist(board, word);

        // Then
        assertTrue(result);
    }

    @Test
    void givenSingleCellBoard_whenWordDoesNotMatch_thenReturnFalse() {
        // Given
        char[][] board = {
                {'A'}
        };
        String word = "B";

        // When
        boolean result = WordSearch.exist(board, word);

        // Then
        assertFalse(result);
    }
}