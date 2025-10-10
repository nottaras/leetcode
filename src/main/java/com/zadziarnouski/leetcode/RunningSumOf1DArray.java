package com.zadziarnouski.leetcode;

class RunningSumOf1DArray {

    //TC: O(n), SC: O(n)
    static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

    //in-place – TC: O(n), SC: O(1)
//    static int[] runningSum(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i - 1];
//        }
//        return nums;
//    }
}
