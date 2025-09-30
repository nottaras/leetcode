package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpGameIITest {

    @Test
    void givenArray_whenCanReachEnd_thenReturnsMinJumps() {
        // given
        int[] nums = {2, 3, 1, 1, 4};

        // when
        int result = JumpGameII.jump(nums);

        // then
        assertEquals(2, result);
    }

    @Test
    void givenSingleElement_whenStartIsEnd_thenReturnsZero() {
        // given
        int[] nums = {0};

        // when
        int result = JumpGameII.jump(nums);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenArrayWithLargeJumps_thenReturnsOne() {
        // given
        int[] nums = {5, 1, 1, 1, 1};

        // when
        int result = JumpGameII.jump(nums);

        // then
        assertEquals(1, result);
    }

    @Test
    void givenArrayWithMinimumSteps_thenReturnsCorrectJumps() {
        // given
        int[] nums = {1, 2, 1, 1, 1};

        // when
        int result = JumpGameII.jump(nums);

        // then
        assertEquals(3, result);
    }

    @Test
    void givenArrayWithAllOnes_thenReturnsLengthMinusOne() {
        // given
        int[] nums = {1, 1, 1, 1};

        // when
        int result = JumpGameII.jump(nums);

        // then
        assertEquals(3, result);
    }
}