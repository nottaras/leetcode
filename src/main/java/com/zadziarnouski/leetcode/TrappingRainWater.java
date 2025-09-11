package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class TrappingRainWater {

    static int trap(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    area += leftMax - height[left];
                }

                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    area += rightMax - height[right];
                }

                right--;
            }
        }

        return area;
    }
}
