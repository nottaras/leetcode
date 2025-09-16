package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void shouldReturnZero_whenEmptyString() {
        // given
        String s = "";
        int k = 2;

        // when
        int result = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnLength_whenAllSameChars() {
        // given
        String s = "AAAA";
        int k = 2;

        // when
        int result = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnCorrectLength_whenOneReplacementAllowed() {
        // given
        String s = "AABABBA";
        int k = 1;

        // when
        int result = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnMaxLength_whenAlternatingChars() {
        // given
        String s = "ABAB";
        int k = 2;

        // when
        int result = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnLength_whenComplexPattern() {
        // given
        String s = "ABABBAA";
        int k = 2;

        // when
        int result = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // then
        assertEquals(5, result);
    }
}