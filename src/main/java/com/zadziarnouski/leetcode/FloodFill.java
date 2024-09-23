package com.zadziarnouski.leetcode;

public class FloodFill {

    static int[][] performFloodFill(int[][] image, int sr, int sc, int color) {
        int val = image[sr][sc];
        dfs(image, sr, sc, val, color);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int val, int color) {
        if (sr < 0 || sr >= image.length
                || sc < 0 || sc >= image[0].length
                || image[sr][sc] == color || image[sr][sc] != val) {
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, val, color);
        dfs(image, sr + 1, sc, val, color);
        dfs(image, sr, sc - 1, val, color);
        dfs(image, sr, sc + 1, val, color);
    }
}
