package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KokoEatingBananasTest {

    @Test
    void shouldReturn4_WhenStandardCase1() {
        // given
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        // when
        int result = KokoEatingBananas.minEatingSpeed(piles, h);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturn30_WhenStandardCase2() {
        // given
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;

        // when
        int result = KokoEatingBananas.minEatingSpeed(piles, h);

        // then
        assertEquals(30, result);
    }

    @Test
    void shouldReturn23_WhenStandardCase3() {
        // given
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;

        // when
        int result = KokoEatingBananas.minEatingSpeed(piles, h);

        // then
        assertEquals(23, result);
    }

    @Test
    void shouldReturn3_WhenHugeBananasSmallH() {
        // given
        int[] piles = {805306368, 805306368, 805306368};
        int h = 1_000_000_000;

        // when
        int result = KokoEatingBananas.minEatingSpeed(piles, h);

        // then
        assertEquals(3, result);
    }
}