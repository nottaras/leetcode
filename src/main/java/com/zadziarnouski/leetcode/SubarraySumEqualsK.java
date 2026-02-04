package com.zadziarnouski.leetcode;

import java.util.HashMap;
import java.util.Map;

//TC: O(n), SC: O(n)
class SubarraySumEqualsK {

    static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            count += freq.getOrDefault(prefixSum - k, 0);

            freq.merge(prefixSum, 1, Integer::sum);
        }

        return count;
    }
}
