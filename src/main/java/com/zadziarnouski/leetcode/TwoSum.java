package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(n)
class TwoSum {
    //TODO: Consider solving this using a hash table for better performance (O(n) time)
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
