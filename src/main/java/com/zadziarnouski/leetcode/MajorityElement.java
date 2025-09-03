package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class MajorityElement {

    static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
