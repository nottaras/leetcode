package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {

    @Test
    void givenTargetPresent_whenSearchMatrix_thenReturnTrue() {
        // given
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;

        // when
        boolean result = Search2DMatrix.searchMatrix(matrix, target);

        // then
        assertTrue(result);
    }

    @Test
    void givenTargetNotPresent_whenSearchMatrix_thenReturnFalse() {
        // given
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;

        // when
        boolean result = Search2DMatrix.searchMatrix(matrix, target);

        // then
        assertFalse(result);
    }

    @Test
    void givenTargetIsSmallest_whenSearchMatrix_thenReturnTrue() {
        // given
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11}
        };
        int target = 1;

        // when
        boolean result = Search2DMatrix.searchMatrix(matrix, target);

        // then
        assertTrue(result);
    }

    @Test
    void givenTargetIsLargest_whenSearchMatrix_thenReturnTrue() {
        // given
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11}
        };
        int target = 11;

        // when
        boolean result = Search2DMatrix.searchMatrix(matrix, target);

        // then
        assertTrue(result);
    }

    @Test
    void givenSingleElementMatrix_whenSearchMatrix_thenReturnTrueIfMatch() {
        // given
        int[][] matrix = {{42}};
        int target = 42;

        // when
        boolean result = Search2DMatrix.searchMatrix(matrix, target);

        // then
        assertTrue(result);
    }

    @Test
    void givenSingleElementMatrix_whenSearchMatrix_thenReturnFalseIfNoMatch() {
        // given
        int[][] matrix = {{42}};
        int target = 7;

        // when
        boolean result = Search2DMatrix.searchMatrix(matrix, target);

        // then
        assertFalse(result);
    }
}