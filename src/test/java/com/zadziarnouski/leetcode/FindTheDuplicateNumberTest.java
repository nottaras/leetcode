package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDuplicateNumberTest {

    @Test
    void shouldReturn3_givenArrayWithDuplicate3() {
        // given
        int[] nums = {1, 3, 4, 2, 2};

        // when
        int result = FindTheDuplicateNumber.findDuplicate(nums);

        // then
        assertEquals(2, result);
    }

    @Test
    void shouldReturn1_givenArrayWithAllElementsSame() {
        // given
        int[] nums = {1, 1, 1, 1, 1};

        // when
        int result = FindTheDuplicateNumber.findDuplicate(nums);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldReturn4_givenArrayWithDuplicate4() {
        // given
        int[] nums = {4, 3, 1, 4, 2};

        // when
        int result = FindTheDuplicateNumber.findDuplicate(nums);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturn3_givenLongInput() {
        // given
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 3};

        // when
        int result = FindTheDuplicateNumber.findDuplicate(nums);

        // then
        assertEquals(3, result);
    }
}