package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllNumbersDisappearedInArrayTest {

    @Test
    void shouldFindMissingNumbers_whenArrayContainsDuplicates() {
        // Given
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // When
        List<Integer> result = FindAllNumbersDisappearedInArray.findDisappearedNumbers(nums);

        // Then
        assertEquals(List.of(5, 6), result);
    }

    @Test
    void shouldReturnEmptyList_whenNoNumbersAreMissing() {
        // Given
        int[] nums = {1, 2, 3, 4, 5};

        // When
        List<Integer> result = FindAllNumbersDisappearedInArray.findDisappearedNumbers(nums);

        // Then
        assertEquals(List.of(), result);
    }

    @Test
    void shouldReturnAllNumbersExceptOne_whenSingleElementRepeated() {
        // Given
        int[] nums = {2, 2, 2, 2};

        // When
        List<Integer> result = FindAllNumbersDisappearedInArray.findDisappearedNumbers(nums);

        // Then
        assertEquals(List.of(1, 3, 4), result);
    }

    @Test
    void shouldHandleMinimumSizeArray() {
        // Given
        int[] nums = {1};

        // When
        List<Integer> result = FindAllNumbersDisappearedInArray.findDisappearedNumbers(nums);

        // Then
        assertEquals(List.of(), result);
    }

    @Test
    void shouldHandleCaseWhereAllNumbersAreMissingExceptOne() {
        // Given
        int[] nums = {1, 1, 1, 1};

        // When
        List<Integer> result = FindAllNumbersDisappearedInArray.findDisappearedNumbers(nums);

        // Then
        assertEquals(List.of(2, 3, 4), result);

    }
}