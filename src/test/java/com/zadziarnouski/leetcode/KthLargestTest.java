package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestTest {

    @Test
    void givenInitialStream_whenAddElements_thenReturnKthLargest() {
        // given
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});

        // when & then
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));
    }

    @Test
    void givenEmptyInitialStream_whenAddElements_thenReturnKthLargest() {
        // given
        KthLargest kthLargest = new KthLargest(1, new int[]{});

        // when & then
        assertEquals(3, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(5));
        assertEquals(8, kthLargest.add(8));
    }

    @Test
    void givenKGreaterThanInitialStream_whenAddElements_thenReturnKthLargest() {
        // given
        KthLargest kthLargest = new KthLargest(5, new int[]{2, 1});

        // when & then
        assertEquals(1, kthLargest.add(3));
        assertEquals(1, kthLargest.add(4));
        assertEquals(1, kthLargest.add(5));
        assertEquals(2, kthLargest.add(6));
    }
}