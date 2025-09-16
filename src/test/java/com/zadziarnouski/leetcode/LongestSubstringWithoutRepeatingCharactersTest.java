package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void should_return_5_when_all_characters_unique() {
        // given
        String s = "abcde";

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // then
        assertEquals(5, result);
    }

    @Test
    void should_return_5_when_middle_characters_repeat() {
        // given
        String s = "abcadeak";

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // then
        assertEquals(5, result); // "bcade"
    }

    @Test
    void should_return_1_when_all_characters_same() {
        // given
        String s = "aaaaaa";

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // then
        assertEquals(1, result);
    }

    @Test
    void should_return_0_when_string_is_empty() {
        // given
        String s = "";

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // then
        assertEquals(0, result);
    }

    @Test
    void should_return_2_when_only_two_chars_repeat_alternately() {
        // given
        String s = "abababab";

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // then
        assertEquals(2, result);
    }

    @Test
    void should_return_9_when_all_characters_are_unique_symbols_and_digits() {
        // given
        String s = "a1!b2@c3#";

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        // then
        assertEquals(9, result);
    }
}