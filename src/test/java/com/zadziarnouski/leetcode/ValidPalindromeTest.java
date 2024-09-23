package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.ValidPalindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    @Test
    void shouldReturnTrueForValidPalindrome() {
        //Given
        String given = "A man, a plan, a canal: Panama";

        //When & Then
        assertTrue(isPalindrome(given));
    }
}