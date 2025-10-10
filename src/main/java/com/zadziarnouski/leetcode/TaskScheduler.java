package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// TC: O(n), SC: O(n)
class TaskScheduler {

    static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) {
                maxHeap.offer(f);
            }
        }

        int time = 0;

        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;

            for (int i = 0; i < cycle && !maxHeap.isEmpty(); i++) {
                temp.add(maxHeap.poll());
            }

            for (int f : temp) {
                if (--f > 0) {
                    maxHeap.offer(f);
                }
            }

            time += maxHeap.isEmpty() ? temp.size() : cycle;
        }

        return time;
    }
}
