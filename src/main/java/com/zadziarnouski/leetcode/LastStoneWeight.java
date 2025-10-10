package com.zadziarnouski.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// TC: O(n * log(n)), SC: O(n)
class LastStoneWeight {

    static int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }

        Queue<Integer> mh = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            mh.offer(stone);
        }

        while (mh.size() > 1) {
            Integer a = mh.poll();
            Integer b = mh.poll();

            assert b != null;

            int diff = a - b;

            if (diff > 0) {
                mh.offer(diff);
            }
        }

        return mh.isEmpty() ? 0 : mh.peek();
    }
}
