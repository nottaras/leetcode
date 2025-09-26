package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

// TC: O(n * log n), SC: O(n)
class MergeIntervals {

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        Deque<int[]> stack = new ArrayDeque<>();

        for (int[] interval : intervals) {
            if (!stack.isEmpty() && interval[0] <= stack.peek()[1]) {
                int[] top = stack.peekLast();
                top[1] = Math.max(top[1], interval[1]);
            } else {
                stack.addLast(interval);
            }
        }

        return stack.toArray(new int[0][]);
    }
}
