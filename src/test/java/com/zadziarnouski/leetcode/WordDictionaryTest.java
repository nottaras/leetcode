package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    void shouldFindExactMatch() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");

        // when
        boolean result = dictionary.search("bad");

        // then
        assertTrue(result);
    }

    @Test
    void shouldNotFindNonExistentWord() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");

        // when
        boolean result = dictionary.search("bat");

        // then
        assertFalse(result);
    }

    @Test
    void shouldFindWordWithSingleWildcard() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");

        // when
        boolean result = dictionary.search("b.d");

        // then
        assertTrue(result);
    }

    @Test
    void shouldFindWordWithMultipleWildcards() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");

        // when
        boolean result = dictionary.search("..d");

        // then
        assertTrue(result);
    }

    @Test
    void shouldNotFindTooShortWord() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");

        // when
        boolean result = dictionary.search("ba");

        // then
        assertFalse(result);
    }

    @Test
    void shouldNotFindTooLongWord() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("bad");

        // when
        boolean result = dictionary.search("badd");

        // then
        assertFalse(result);
    }

    @Test
    void shouldHandleEmptyWordSearch() {
        // given
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("");

        // when
        boolean result = dictionary.search("");

        // then
        assertTrue(result);
    }

    @Test
    void shouldHandleEmptyWordSearchNegative() {
        // given
        WordDictionary dictionary = new WordDictionary();

        // when
        boolean result = dictionary.search("");

        // then
        assertFalse(result);
    }
}