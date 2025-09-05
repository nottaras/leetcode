package com.zadziarnouski.leetcode;

class MaximumAverageSubarrayI {

    static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxSum;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum / k;
    }
}
