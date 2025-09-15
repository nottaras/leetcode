package com.zadziarnouski.leetcode;

// TC: O(log n), SC: O(1)
class FindMinimumInRotatedSortedArray {

    static int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}
