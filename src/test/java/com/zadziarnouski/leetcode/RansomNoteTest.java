package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RansomNoteTest {

    @Test
    void shouldReturnTrue_whenRansomNoteCanBeConstructed() {
        // Given
        String ransomNote = "a";
        String magazine = "bca";
        RansomNote checker = new RansomNote();

        // When & Then
        assertTrue(checker.canConstruct(ransomNote, magazine));
    }

    @Test
    void shouldReturnFalse_whenRansomNoteCannotBeConstructed() {
        // Given
        String ransomNote = "aa";
        String magazine = "ab";
        RansomNote checker = new RansomNote();

        // When & Then
        assertFalse(checker.canConstruct(ransomNote, magazine));
    }

    @Test
    void shouldReturnTrue_whenBothAreEmpty() {
        // Given
        String ransomNote = "";
        String magazine = "";
        RansomNote checker = new RansomNote();

        // When & Then
        assertTrue(checker.canConstruct(ransomNote, magazine));
    }

    @Test
    void shouldReturnTrue_whenRansomNoteIsEmpty() {
        // Given
        String ransomNote = "";
        String magazine = "anything";
        RansomNote checker = new RansomNote();

        // When & Then
        assertTrue(checker.canConstruct(ransomNote, magazine));
    }

    @Test
    void shouldReturnFalse_whenMagazineIsEmpty() {
        // Given
        String ransomNote = "a";
        String magazine = "";
        RansomNote checker = new RansomNote();

        // When & Then
        assertFalse(checker.canConstruct(ransomNote, magazine));
    }
}