package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {

    @Test
    void shouldReturnZero_whenOnlyOneBar() {
        int[] height = {4};
        int result = TrappingRainWater.trap(height);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZero_whenBarsCannotTrapWater() {
        int[] height = {1, 2, 3, 4};
        int result = TrappingRainWater.trap(height);
        assertEquals(0, result);
    }

    @Test
    void shouldReturnSix_whenHeightsAre_0_1_0_2_1_0_1_3_2_1_2_1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = TrappingRainWater.trap(height);
        assertEquals(6, result);
    }

    @Test
    void shouldReturnNine_whenHeightsAre_4_2_0_3_2_5() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int result = TrappingRainWater.trap(height);
        assertEquals(9, result);
    }
}