package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.BinarySearch.search1;
import static com.zadziarnouski.leetcode.BinarySearch.search2;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void shouldReturnIndexForExistingTargetInFirstImplementation() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        //When & Then
        assertEquals(4, search1(nums, target));
    }

    @Test
    void shouldReturnNegativeOneForTargetNotInArrayFirstImplementation() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        //When & Then
        assertEquals(-1, search1(nums, target));
    }

    @Test
    void shouldReturnIndexForExistingTargetInSecondImplementation() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        //When & Then
        assertEquals(4, search2(nums, target));
    }

    @Test
    void shouldReturnNegativeOneForTargetNotInArraySecondImplementation() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        //When & Then
        assertEquals(-1, search2(nums, target));
    }
}
