package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void givenInsertedWord_whenSearch_thenReturnsTrue() {
        Trie trie = new Trie();
        trie.insert("apple");

        assertTrue(trie.search("apple"));
    }

    @Test
    void givenNonInsertedWord_whenSearch_thenReturnsFalse() {
        Trie trie = new Trie();
        trie.insert("apple");

        assertFalse(trie.search("app"));
    }

    @Test
    void givenInsertedWord_whenStartsWith_thenReturnsTrue() {
        Trie trie = new Trie();
        trie.insert("apple");

        assertTrue(trie.startsWith("app"));
    }

    @Test
    void givenNonInsertedPrefix_whenStartsWith_thenReturnsFalse() {
        Trie trie = new Trie();
        trie.insert("banana");

        assertFalse(trie.startsWith("bananas"));
    }

    @Test
    void givenMultipleWords_whenSearch_thenCorrectlyHandlesEach() {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");

        assertTrue(trie.search("app"));
        assertTrue(trie.search("apple"));
        assertTrue(trie.search("application"));
        assertFalse(trie.search("appl"));
    }

    @Test
    void givenEmptyString_whenInsertAndSearch_thenBehavesCorrectly() {
        Trie trie = new Trie();
        trie.insert("");

        assertTrue(trie.search(""));
        assertTrue(trie.startsWith(""));
    }

    @Test
    void givenUppercaseLetters_whenInsertAndSearch_thenHandlesCorrectly() {
        Trie trie = new Trie();
        trie.insert("AbC");

        assertTrue(trie.search("AbC"));
        assertFalse(trie.search("abc"));
    }

}