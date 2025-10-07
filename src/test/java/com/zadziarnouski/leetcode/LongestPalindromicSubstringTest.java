package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void givenSingleChar_whenFindLongestPalindrome_thenReturnsSameChar() {
        // given
        String input = "a";

        // when
        String result = LongestPalindromicSubstring.longestPalindrome(input);

        // then
        assertEquals("a", result);
    }

    @Test
    void givenPalindrome_whenFindLongestPalindrome_thenReturnsFullString() {
        // given
        String input = "racecar";

        // when
        String result = LongestPalindromicSubstring.longestPalindrome(input);

        // then
        assertEquals("racecar", result);
    }

    @Test
    void givenStringWithMultiplePalindromes_whenFindLongestPalindrome_thenReturnsAnyLongest() {
        // given
        String input = "babad";

        // when
        String result = LongestPalindromicSubstring.longestPalindrome(input);

        // then
        assertTrue(result.equals("bab") || result.equals("aba"));
    }

    @Test
    void givenEvenLengthPalindrome_whenFindLongestPalindrome_thenReturnsIt() {
        // given
        String input = "cbbd";

        // when
        String result = LongestPalindromicSubstring.longestPalindrome(input);

        // then
        assertEquals("bb", result);
    }

    @Test
    void givenStringWithoutLongPalindrome_whenFindLongestPalindrome_thenReturnsAnySingleChar() {
        // given
        String input = "abc";

        // when
        String result = LongestPalindromicSubstring.longestPalindrome(input);

        // then
        assertEquals(1, result.length());
        assertTrue(input.contains(result));
    }

    @Test
    void givenRepeatingChars_whenFindLongestPalindrome_thenReturnsFullString() {
        // given
        String input = "aaaa";

        // when
        String result = LongestPalindromicSubstring.longestPalindrome(input);

        // then
        assertEquals("aaaa", result);
    }

}