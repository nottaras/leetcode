package com.zadziarnouski.leetcode;

import java.util.Arrays;
import java.util.Comparator;

// TC: O(n * log n), SC: O(n)
class NonOverlappingIntervals {

    static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int prevEnd = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= prevEnd) {
                prevEnd = interval[1];
            } else {
                count++;
            }
        }

        return count;
    }
}
