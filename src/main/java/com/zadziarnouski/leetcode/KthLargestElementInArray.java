package com.zadziarnouski.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

// TC: O(n * log k), SC: O(k)
class KthLargestElementInArray {

    static int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        assert !minHeap.isEmpty();

        return minHeap.peek();
    }
}
