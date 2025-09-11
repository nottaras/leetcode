package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {
    private MinStack minStack;

    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @Test
    void shouldReturnLastPushedValue_whenTopCalled() {
        // When
        minStack.push(5);
        minStack.push(3);

        // Then
        assertEquals(3, minStack.top());
    }

    @Test
    void shouldReturnMinimumValue_whenGetMinCalled() {
        // When
        minStack.push(4);
        minStack.push(2);
        minStack.push(7);

        // Then
        assertEquals(2, minStack.getMin());
    }

    @Test
    void shouldUpdateMin_whenMinValuePopped() {
        // When
        minStack.push(6);
        minStack.push(1);
        minStack.push(3);
        minStack.pop();
        minStack.pop();

        // Then
        assertEquals(6, minStack.getMin());
    }

    @Test
    void shouldKeepMin_whenDuplicateMinimumPopped() {
        // When
        minStack.push(2);
        minStack.push(1);
        minStack.push(1);
        minStack.pop();

        // Then
        assertEquals(1, minStack.getMin());
    }
}