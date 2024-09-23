package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.ValidAnagram.isAnagram;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    @Test
    void shouldReturnTrueForValidAnagrams() {
        //Given
        String original = "anagram";
        String anagramCandidate = "nagaram";

        //When & Then
        assertTrue(isAnagram(original, anagramCandidate));
    }
}