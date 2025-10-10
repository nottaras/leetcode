package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.Interval;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// TC: O(n * log n), SC: O(n)
class MeetingRoomsII {

    static int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }

        intervals.sort(Comparator.comparingInt(a -> a.start));

        Queue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(intervals.getFirst().end);

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);

            assert minHeap.peek() != null;

            if (current.start >= minHeap.peek()) {
                minHeap.poll();
            }

            minHeap.offer(current.end);
        }

        return minHeap.size();
    }
}
