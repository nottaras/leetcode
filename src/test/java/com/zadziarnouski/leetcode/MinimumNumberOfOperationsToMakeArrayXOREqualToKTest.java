package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.MinimumNumberOfOperationsToMakeArrayXOREqualToK.minOperations;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfOperationsToMakeArrayXOREqualToKTest {

    @Test
    void shouldReturnMinimumOperations() {
        //Given
        var nums = new int[]{2, 1, 3, 4};
        var k = 1;

        //When & Then
        assertEquals(2, minOperations(nums, k));
    }
}