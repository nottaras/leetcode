package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.BinarySearch.search;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void shouldReturnIndexWhenTargetExists() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        //When & Then
        assertEquals(4, search(nums, target));
    }

    @Test
    void shouldReturnNegativeOneWhenTargetDoesNotExist() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        //When & Then
        assertEquals(-1, search(nums, target));
    }
}
