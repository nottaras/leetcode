package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.MinimumFallingPathSum.minFallingPathSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumFallingPathSumTest {

    @Test
    void shouldReturnMinimumFallingPathSum() {
        //Given
        int[][] given =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                };

        //When & Then
        assertEquals(13, minFallingPathSum(given));
    }
}