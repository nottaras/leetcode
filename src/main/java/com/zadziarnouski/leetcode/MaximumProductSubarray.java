package com.zadziarnouski.leetcode;

//TC: O(n), SC: O(1)
class MaximumProductSubarray {

    static int maxProduct(int[] nums) {
        int minProd = nums[0];
        int maxProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];

            if (cur < 0) {
                int tmp = maxProd;
                maxProd = minProd;
                minProd = tmp;
            }

            maxProd = Math.max(cur, cur * maxProd);
            minProd = Math.min(cur, cur * minProd);

            result = Math.max(result, maxProd);
        }

        return result;
    }
}
