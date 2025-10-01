package com.zadziarnouski.leetcode;

// TC: O(m * n), SC: O(m * n)
class NumberOfIslands {

    static int numIslands(char[][] grid) {
        int counter = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void dfs(char[][] grid, int r, int c) {
        if (Math.min(r, c) < 0 || r > grid.length - 1 || c > grid[0].length - 1 || grid[r][c] == '0') {
            return;
        }

        if (grid[r][c] == '1') {
            grid[r][c] = '0';
        }

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
