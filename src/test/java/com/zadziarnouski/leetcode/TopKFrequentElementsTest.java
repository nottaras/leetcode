package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TopKFrequentElementsTest {

    @Test
    void shouldReturnTop1Element_whenKIs1() {
        // given
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 1;

        // when
        int[] result = TopKFrequentElements.topKFrequent(nums, k);

        // then
        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

    @Test
    void shouldReturnTop2Elements_whenKIs2() {
        // given
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        // when
        int[] result = TopKFrequentElements.topKFrequent(nums, k);

        // then
        assertEquals(2, result.length);
        assertTrue(containsAll(result, new int[]{1, 2}));
    }

    @Test
    void shouldReturnAllElements_whenKEqualsUniqueCount() {
        // given
        int[] nums = {5, 6, 7};
        int k = 3;

        // when
        int[] result = TopKFrequentElements.topKFrequent(nums, k);

        // then
        assertEquals(3, result.length);
        assertTrue(containsAll(result, new int[]{5, 6, 7}));
    }

    @Test
    void shouldReturnOnlyOneElement_whenOnlyOneRepeated() {
        // given
        int[] nums = {4, 4, 4, 4};
        int k = 1;

        // when
        int[] result = TopKFrequentElements.topKFrequent(nums, k);

        // then
        assertArrayEquals(new int[]{4}, result);
    }

    private boolean containsAll(int[] actual, int[] expected) {
        return Arrays.stream(expected).allMatch(x -> Arrays.stream(actual).anyMatch(y -> y == x));
    }
}