package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void shouldReturnTriplets_whenMultipleValidCombinationsExist() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = ThreeSum.threeSum(nums);

        List<List<Integer>> expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void shouldReturnEmptyList_whenNoTripletsSumToZero() {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = ThreeSum.threeSum(nums);

        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnSingleTriplet_whenOnlyOneValidExists() {
        int[] nums = {0, 0, 0};

        List<List<Integer>> result = ThreeSum.threeSum(nums);

        List<List<Integer>> expected = List.of(
                List.of(0, 0, 0)
        );

        assertEquals(expected, result);
    }

    @Test
    void shouldHandleLargeNegativeAndPositiveNumbers() {
        int[] nums = {-1000000, 500000, 500000};

        List<List<Integer>> result = ThreeSum.threeSum(nums);

        List<List<Integer>> expected = List.of(
                List.of(-1000000, 500000, 500000)
        );

        assertEquals(expected, result);
    }

}