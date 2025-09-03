package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    @Test
    void shouldReturnElement_whenArrayHasSingleElement() {
        // Given
        int[] nums = {3};

        // When
        int result = MajorityElement.majorityElement(nums);

        // Then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnMajority_whenItIsSpreadAcrossArray() {
        // Given
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // When
        int result = MajorityElement.majorityElement(nums);

        // Then
        assertEquals(2, result);
    }

    @Test
    void shouldReturnMajority_whenAllElementsSame() {
        // Given
        int[] nums = {7, 7, 7, 7, 7};

        // When
        int result = MajorityElement.majorityElement(nums);

        // Then
        assertEquals(7, result);
    }

    @Test
    void shouldReturnMajority_whenItAppearsAtStartAndEnd() {
        // Given
        int[] nums = {9, 9, 9, 2, 3, 4, 9, 9};

        // When
        int result = MajorityElement.majorityElement(nums);

        // Then
        assertEquals(9, result);
    }

    @Test
    void shouldReturnMajority_whenItIsAtMiddle() {
        // Given
        int[] nums = {1, 1, 2, 2, 2, 2};

        // When
        int result = MajorityElement.majorityElement(nums);

        // Then
        assertEquals(2, result);
    }
}