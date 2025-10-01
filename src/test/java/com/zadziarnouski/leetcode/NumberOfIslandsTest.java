package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void shouldReturn1ForSingleIsland() {
        char[][] grid = {
                {'1', '1', '0'},
                {'1', '1', '0'},
                {'0', '0', '0'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    @Test
    void shouldReturn3ForThreeIslands() {
        char[][] grid = {
                {'1', '0', '1', '0'},
                {'0', '0', '0', '0'},
                {'1', '0', '1', '1'}
        };

        assertEquals(4, NumberOfIslands.numIslands(grid));
    }

    @Test
    void shouldReturn0ForEmptyGrid() {
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'}
        };

        assertEquals(0, NumberOfIslands.numIslands(grid));
    }

    @Test
    void shouldReturn1ForOneCellIsland() {
        char[][] grid = {
                {'1'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }

    @Test
    void shouldReturn0ForEmptyInput() {
        char[][] grid = new char[0][0];
        assertEquals(0, NumberOfIslands.numIslands(grid));
    }
}