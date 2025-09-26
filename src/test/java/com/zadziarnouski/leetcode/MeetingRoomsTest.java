package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.Interval;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeetingRoomsTest {

    @Test
    void givenNonOverlappingIntervals_whenCheckAvailability_thenReturnTrue() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(0, 30),
                new Interval(35, 50),
                new Interval(60, 70)
        ));

        boolean result = MeetingRooms.canAttendMeetings(intervals);

        assertTrue(result);
    }

    @Test
    void givenOverlappingIntervals_whenCheckAvailability_thenReturnFalse() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(0, 30),
                new Interval(20, 40)
        ));

        boolean result = MeetingRooms.canAttendMeetings(intervals);

        assertFalse(result);
    }

    @Test
    void givenEmptyIntervalList_whenCheckAvailability_thenReturnTrue() {
        List<Interval> intervals = new ArrayList<>();

        boolean result = MeetingRooms.canAttendMeetings(intervals);

        assertTrue(result);
    }

    @Test
    void givenSingleInterval_whenCheckAvailability_thenReturnTrue() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(10, 20)
        ));

        boolean result = MeetingRooms.canAttendMeetings(intervals);

        assertTrue(result);
    }

    @Test
    void givenAdjacentIntervals_whenCheckAvailability_thenReturnTrue() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(0, 10),
                new Interval(10, 20),
                new Interval(20, 30)
        ));

        boolean result = MeetingRooms.canAttendMeetings(intervals);

        assertTrue(result);
    }
}
