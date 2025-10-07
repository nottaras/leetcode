package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class HouseRobberII {

    static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(robLinear(nums, 0, nums.length - 2), robLinear(nums, 1, nums.length - 1));
    }

    private static int robLinear(int[] nums, int start, int end) {
        int prev = 0;
        int curr = 0;

        for (int i = start; i <= end; i++) {
            int temp = Math.max(curr, prev + nums[i]);
            prev = curr;
            curr = temp;
        }

        return curr;
    }
}
