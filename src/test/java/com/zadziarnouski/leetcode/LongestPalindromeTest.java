package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {
    @Test
    void shouldReturn7_whenInputIsMixedCase() {
        // Given
        LongestPalindrome solver = new LongestPalindrome();
        String input = "AaBbCcaa";

        // When & Then
        assertEquals(3, solver.longestPalindrome(input));
    }

    @Test
    void shouldReturnLengthOfWholeString_whenAllPairs() {
        // Given
        LongestPalindrome solver = new LongestPalindrome();
        String input = "abccba";

        // When & Then
        assertEquals(6, solver.longestPalindrome(input));
    }

    @Test
    void shouldReturn1_whenOnlySingleLetter() {
        // Given
        LongestPalindrome solver = new LongestPalindrome();
        String input = "a";

        // When & Then
        assertEquals(1, solver.longestPalindrome(input));
    }

    @Test
    void shouldReturn0_whenEmptyString() {
        // Given
        LongestPalindrome solver = new LongestPalindrome();
        String input = "";

        // When & Then
        assertEquals(0, solver.longestPalindrome(input));
    }

    @Test
    void shouldReturnOddLength_whenOneOddCharacter() {
        // Given
        LongestPalindrome solver = new LongestPalindrome();
        String input = "aaabbb";

        // When & Then
        assertEquals(5, solver.longestPalindrome(input));
    }
}