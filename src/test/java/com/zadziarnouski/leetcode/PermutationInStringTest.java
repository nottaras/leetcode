package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void shouldReturnTrue_whenPermutationExists() {
        // given
        String s1 = "ab";
        String s2 = "eidbaooo";

        // when
        boolean result = PermutationInString.checkInclusion(s1, s2);

        // then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalse_whenPermutationDoesNotExist() {
        // given
        String s1 = "ab";
        String s2 = "eidboaoo";

        // when
        boolean result = PermutationInString.checkInclusion(s1, s2);

        // then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrue_whenExactMatch() {
        // given
        String s1 = "abc";
        String s2 = "cba";

        // when
        boolean result = PermutationInString.checkInclusion(s1, s2);

        // then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalse_whenS2ShorterThanS1() {
        // given
        String s1 = "abcd";
        String s2 = "abc";

        // when
        boolean result = PermutationInString.checkInclusion(s1, s2);

        // then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrue_whenMultiplePermutationsInS2() {
        // given
        String s1 = "aab";
        String s2 = "baaa";

        // when
        boolean result = PermutationInString.checkInclusion(s1, s2);

        // then
        assertTrue(result);
    }

}