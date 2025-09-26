package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.List;

// TC: O(n), SC: O(n)
class InsertInterval {

    static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                result.add(interval);
            } else if (interval[0] <= newInterval[1]) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                result.add(newInterval);
                newInterval = interval;
            }
        }

        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}
