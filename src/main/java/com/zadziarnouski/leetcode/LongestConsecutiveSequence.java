package com.zadziarnouski.leetcode;

import java.util.HashSet;
import java.util.Set;

// TC: O(n), SC: O(n)
class LongestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                max = Math.max(length, max);
            }
        }

        return max;
    }
}
