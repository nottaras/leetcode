package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class MissingNumber {

    static int missingNumber(int[] nums) {
        int expected = nums.length * (nums.length + 1) / 2;
        int actual = 0;

        for (int num : nums) {
            actual += num;
        }

        return expected - actual;
    }
}
