package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandTest {

    @Test
    void givenIslandGrid_whenSingleIsland_thenReturnsCorrectArea() {
        int[][] grid = {
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0}
        };

        assertEquals(5, MaxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    void givenIslandGrid_whenMultipleIslands_thenReturnsMaxArea() {
        int[][] grid = {
                {1, 0, 0, 1},
                {1, 0, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, 1}
        };

        assertEquals(4, MaxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    void givenGridWithNoIslands_thenReturnsZero() {
        int[][] grid = {
                {0, 0},
                {0, 0}
        };

        assertEquals(0, MaxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    void givenGridWithAllLand_thenReturnsFullArea() {
        int[][] grid = {
                {1, 1},
                {1, 1}
        };

        assertEquals(4, MaxAreaOfIsland.maxAreaOfIsland(grid));
    }

    @Test
    void givenEmptyGrid_thenReturnsZero() {
        int[][] grid = new int[0][0];

        assertEquals(0, MaxAreaOfIsland.maxAreaOfIsland(grid));
    }
}