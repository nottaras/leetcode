package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class GasStation {

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            total += gain;
            tank += gain;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total < 0 ? -1 : start;
    }
}
