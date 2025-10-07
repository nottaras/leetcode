package com.zadziarnouski.leetcode;

//TC: O(n), SC: O(1)
class ClimbingStairs {

    static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
