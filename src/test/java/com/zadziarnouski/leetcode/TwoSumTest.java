package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void shouldReturnIndicesOfTwoNumbers() {
        //Given
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;

        //When & Then
        assertArrayEquals(new int[]{0, 1}, twoSum(nums, target));
    }
}