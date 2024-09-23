package com.zadziarnouski.leetcode;

import java.util.Arrays;

public class BinarySearch {

    static int search1(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int mid = nums.length / 2;

        if (nums[mid] == target) {
            return mid;
        }

        int left = search1(Arrays.copyOfRange(nums, 0, mid), target);
        if (left != -1) {
            return left;
        }

        int right = search1(Arrays.copyOfRange(nums, mid + 1, nums.length), target);
        if (right != -1) {
            return mid + 1 + right;
        }

        return -1;
    }

    static int search2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }
}
