package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class JumpGame {

    static boolean canJump(int[] nums) {
        int maxPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxPos) {
                return false;
            }

            maxPos = Math.max(maxPos, i + nums[i]);
        }

        return true;
    }
}
