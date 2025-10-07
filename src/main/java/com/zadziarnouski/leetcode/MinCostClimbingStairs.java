package com.zadziarnouski.leetcode;

class MinCostClimbingStairs {

    static int minCostClimbingStairs(int[] cost) {
        int prev = 0;
        int curr = 0;

        for (int i = 2; i <= cost.length; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
