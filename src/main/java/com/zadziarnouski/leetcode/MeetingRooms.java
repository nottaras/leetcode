package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.Interval;

import java.util.Comparator;
import java.util.List;

// TC: O(n * log n), SC: O(n)
class MeetingRooms {

    static boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(a -> a.start));

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {
                return false;
            }
        }

        return true;
    }
}
