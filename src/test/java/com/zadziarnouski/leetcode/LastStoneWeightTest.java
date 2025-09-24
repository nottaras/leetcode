package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastStoneWeightTest {

    @Test
    void shouldReturn1_whenStonesHaveVariousWeights() {
        // given
        int[] stones = {2, 7, 4, 1, 8, 1};

        // when
        int result = LastStoneWeight.lastStoneWeight(stones);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldReturn0_whenAllStonesCancelOut() {
        // given
        int[] stones = {2, 2};

        // when
        int result = LastStoneWeight.lastStoneWeight(stones);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnSingleWeight_whenOneStone() {
        // given
        int[] stones = {7};

        // when
        int result = LastStoneWeight.lastStoneWeight(stones);

        // then
        assertEquals(7, result);
    }

    @Test
    void shouldReturnCorrectWeight_whenTwoStonesDifferent() {
        // given
        int[] stones = {10, 4};

        // when
        int result = LastStoneWeight.lastStoneWeight(stones);

        // then
        assertEquals(6, result);
    }

    @Test
    void shouldReturnCorrectWeight_whenLargeStones() {
        // given
        int[] stones = {805306368, 805306368, 805306368};

        // when
        int result = LastStoneWeight.lastStoneWeight(stones);

        // then
        assertEquals(805306368, result);
    }
}