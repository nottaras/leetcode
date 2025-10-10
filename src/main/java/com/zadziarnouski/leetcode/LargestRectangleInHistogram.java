package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;

//TC: O(n), SC: O(n)
class LargestRectangleInHistogram {

    static int largestRectangleArea(int[] heights) {
        int area = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                area = Math.max(area, height * width);
            }

            stack.push(i);
        }

        return area;
    }
}
