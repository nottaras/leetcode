package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    void givenReachableArray_whenCanJump_thenReturnsTrue() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(JumpGame.canJump(nums));
    }

    @Test
    void givenUnreachableArray_whenCanJump_thenReturnsFalse() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(JumpGame.canJump(nums));
    }

    @Test
    void givenSingleElement_whenCanJump_thenReturnsTrue() {
        int[] nums = {0};
        assertTrue(JumpGame.canJump(nums));
    }

    @Test
    void givenAllZerosExceptFirst_whenCanJump_thenReturnsTrue() {
        int[] nums = {5, 0, 0, 0, 0, 0};
        assertTrue(JumpGame.canJump(nums));
    }

    @Test
    void givenZeroAtStartAndLengthGt1_whenCanJump_thenReturnsFalse() {
        int[] nums = {0, 1};
        assertFalse(JumpGame.canJump(nums));
    }
}