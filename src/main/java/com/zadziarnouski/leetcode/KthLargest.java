package com.zadziarnouski.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    Queue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > this.k) {
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.offer(val);

        if (pq.size() > k) {
            pq.poll();
        }

        assert !pq.isEmpty();

        return pq.peek();
    }
}
