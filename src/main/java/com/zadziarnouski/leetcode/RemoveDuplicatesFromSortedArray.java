package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 1]) {
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }
}
