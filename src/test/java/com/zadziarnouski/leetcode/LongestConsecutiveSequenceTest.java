package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    @Test
    void shouldReturn4_whenSequenceIsUnordered() {
        // given
        int[] nums = {100, 4, 200, 1, 3, 2};

        // when
        int result = LongestConsecutiveSequence.longestConsecutive(nums);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturn0_whenArrayIsEmpty() {
        // given
        int[] nums = {};

        // when
        int result = LongestConsecutiveSequence.longestConsecutive(nums);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturn1_whenAllElementsAreSame() {
        // given
        int[] nums = {1, 1, 1};

        // when
        int result = LongestConsecutiveSequence.longestConsecutive(nums);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldReturn5_whenLongestSequenceIsInMiddle() {
        // given
        int[] nums = {10, 5, 4, 1, 2, 3, 6, 20};

        // when
        int result = LongestConsecutiveSequence.longestConsecutive(nums);

        // then
        assertEquals(6, result);
    }

    @Test
    void shouldReturn6_whenSequenceIncludesNegatives() {
        // given
        int[] nums = {0, -1, -2, -3, -4, -5};

        // when
        int result = LongestConsecutiveSequence.longestConsecutive(nums);

        // then
        assertEquals(6, result);
    }
}