package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.Interval;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingRoomsIITest {

    @Test
    void givenNonOverlappingMeetings_whenCalculateMinRooms_thenReturn1() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(1, 2),
                new Interval(3, 4),
                new Interval(5, 6)
        ));

        int result = MeetingRoomsII.minMeetingRooms(intervals);

        assertEquals(1, result);
    }

    @Test
    void givenOverlappingMeetings_whenCalculateMinRooms_thenReturn2() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(0, 30),
                new Interval(5, 10),
                new Interval(15, 20)
        ));

        int result = MeetingRoomsII.minMeetingRooms(intervals);

        assertEquals(2, result);
    }

    @Test
    void givenAllMeetingsOverlap_whenCalculateMinRooms_thenReturn3() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(1, 10),
                new Interval(2, 7),
                new Interval(3, 5)
        ));

        int result = MeetingRoomsII.minMeetingRooms(intervals);

        assertEquals(3, result);
    }

    @Test
    void givenSingleMeeting_whenCalculateMinRooms_thenReturn1() {
        List<Interval> intervals = new ArrayList<>(List.of(
                new Interval(1, 2)
        ));

        int result = MeetingRoomsII.minMeetingRooms(intervals);

        assertEquals(1, result);
    }

    @Test
    void givenEmptyList_whenCalculateMinRooms_thenReturn0() {
        List<Interval> intervals = new ArrayList<>();

        int result = MeetingRoomsII.minMeetingRooms(intervals);

        assertEquals(0, result);
    }
}