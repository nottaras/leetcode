package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    @Test
    void givenGridWithAllFreshOranges_whenNoRotten_thenReturnMinusOne() {
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(-1, RottingOranges.orangesRotting(grid));
    }

    @Test
    void givenGridWithAllRottenOranges_whenNoFresh_thenReturnZero() {
        int[][] grid = {
                {2, 2},
                {2, 2}
        };
        assertEquals(0, RottingOranges.orangesRotting(grid));
    }

    @Test
    void givenGridWithMixedOranges_whenAllCanRot_thenReturnTime() {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, RottingOranges.orangesRotting(grid));
    }

    @Test
    void givenGridWithIsolatedFreshOrange_whenCannotBeReached_thenReturnMinusOne() {
        int[][] grid = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        assertEquals(-1, RottingOranges.orangesRotting(grid));
    }

    @Test
    void givenGridWithSingleCellRotten_thenReturnZero() {
        int[][] grid = {{2}};
        assertEquals(0, RottingOranges.orangesRotting(grid));
    }

    @Test
    void givenGridWithSingleCellFresh_thenReturnMinusOne() {
        int[][] grid = {{1}};
        assertEquals(-1, RottingOranges.orangesRotting(grid));
    }

    @Test
    void givenGridWithNoOranges_thenReturnZero() {
        int[][] grid = {
                {0, 0},
                {0, 0}
        };
        assertEquals(0, RottingOranges.orangesRotting(grid));
    }
}