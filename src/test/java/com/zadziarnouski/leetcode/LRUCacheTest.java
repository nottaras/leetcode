package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    void givenCacheWithCapacity_whenPutAndGet_thenReturnStoredValues() {
        // Given
        LRUCache cache = new LRUCache(2);

        // When
        cache.put(1, 1);
        cache.put(2, 2);

        // Then
        assertEquals(1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void givenCacheAtCapacity_whenAddNewKey_thenEvictLeastRecentlyUsed() {
        // Given
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);

        // When
        cache.get(1);    // mark 1 as recently used
        cache.put(3, 3); // should evict key 2

        // Then
        assertEquals(1, cache.get(1));
        assertEquals(-1, cache.get(2));
        assertEquals(3, cache.get(3));
    }

    @Test
    @SuppressWarnings("all")
    void givenExistingKey_whenPutWithNewValue_thenUpdateValue() {
        // Given
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);

        // When
        cache.put(1, 10);

        // Then
        assertEquals(10, cache.get(1));
    }

    @Test
    void givenCacheFull_whenAddAnotherKey_thenEvictOldest() {
        // Given
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);

        // When
        cache.put(3, 3); // evicts key 1

        // Then
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
        assertEquals(3, cache.get(3));
    }

}