package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TC: O(n), SC: O(n)
@SuppressWarnings("unchecked")
class TopKFrequentElements {

    static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1 && k == 1) {
            return nums;
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
