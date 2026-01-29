package com.zadziarnouski.leetcode;

//TC: O(n), SC:O(1)
public class RemoveElement {

    static int removeElement(int[] nums, int val) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }
}
