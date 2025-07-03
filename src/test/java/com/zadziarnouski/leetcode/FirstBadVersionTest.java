package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    @Test
    void shouldReturnFirstBadVersion_whenItExists() {
        // Given
        int firstBad = 4;
        int totalVersions = 7;
        FirstBadVersion finder = new FirstBadVersion(firstBad);

        // When
        int result = finder.firstBadVersion(totalVersions);

        // Then
        assertEquals(firstBad, result);
    }

    @Test
    void shouldReturnFirstBadVersion_whenItIsFirst() {
        // Given
        int firstBad = 1;
        int totalVersions = 5;
        FirstBadVersion finder = new FirstBadVersion(firstBad);

        // When
        int result = finder.firstBadVersion(totalVersions);

        // Then
        assertEquals(firstBad, result);
    }

    @Test
    void shouldReturnFirstBadVersion_whenItIsLast() {
        // Given
        int firstBad = 10;
        int totalVersions = 10;
        FirstBadVersion finder = new FirstBadVersion(firstBad);

        // When
        int result = finder.firstBadVersion(totalVersions);

        // Then
        assertEquals(firstBad, result);
    }

}