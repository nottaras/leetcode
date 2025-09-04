package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    @Test
    void shouldGroupAnagrams_whenMultipleGroupsExist() {
        // Given
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // When
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);

        // Then
        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea")
        );
        assertEquals(normalize(expected), normalize(result));
    }

    @Test
    void shouldGroupAnagrams_whenOnlyOneGroupExists() {
        // Given
        String[] input = {"abc", "bca", "cab"};

        // When
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);

        // Then
        List<List<String>> expected = List.of(
                List.of("abc", "bca", "cab")
        );
        assertEquals(normalize(expected), normalize(result));
    }

    @Test
    void shouldReturnSameWords_whenAllUnique() {
        // Given
        String[] input = {"abc", "def", "ghi"};

        // When
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);

        // Then
        List<List<String>> expected = List.of(
                List.of("abc"),
                List.of("def"),
                List.of("ghi")
        );
        assertEquals(normalize(expected), normalize(result));
    }

    @Test
    void shouldHandleEmptyInput() {
        // Given
        String[] input = {};

        // When
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);

        // Then
        List<List<String>> expected = List.of();
        assertEquals(expected, result);
    }

    @Test
    void shouldHandleSingleWord() {
        // Given
        String[] input = {"solo"};

        // When
        List<List<String>> result = GroupAnagrams.groupAnagrams(input);

        // Then
        List<List<String>> expected = List.of(List.of("solo"));
        assertEquals(expected, result);
    }

    private static List<List<String>> normalize(List<List<String>> input) {
        List<List<String>> copy = new ArrayList<>(input.stream()
                .map(ArrayList::new)
                .toList());

        for (List<String> group : copy) {
            Collections.sort(group);
        }

        copy.sort(Comparator.comparing(Object::toString));
        return copy;
    }
}