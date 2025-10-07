package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromicSubstringsTest {

    @Test
    void givenSingleCharacter_whenCountSubstrings_thenReturnsOne() {
        // given
        String s = "a";

        // when
        int result = PalindromicSubstrings.countSubstrings(s);

        // then
        assertEquals(1, result);
    }

    @Test
    void givenRepeatedCharacters_whenCountSubstrings_thenReturnsAllPalindromes() {
        // given
        String s = "aaa";

        // when
        int result = PalindromicSubstrings.countSubstrings(s);

        // then
        assertEquals(6, result);
    }

    @Test
    void givenMixedString_whenCountSubstrings_thenReturnsCorrectCount() {
        // given
        String s = "abc";

        // when
        int result = PalindromicSubstrings.countSubstrings(s);

        // then
        assertEquals(3, result);
    }

    @Test
    void givenEmptyString_whenCountSubstrings_thenReturnsZero() {
        // given
        String s = "";

        // when
        int result = PalindromicSubstrings.countSubstrings(s);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenPalindrome_whenCountSubstrings_thenReturnsAllSubPalindromes() {
        // given
        String s = "abba";

        // when
        int result = PalindromicSubstrings.countSubstrings(s);

        // then
        assertEquals(6, result);
    }
}