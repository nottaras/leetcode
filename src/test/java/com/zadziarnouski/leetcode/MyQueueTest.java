package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MyQueueTest {

    @Test
    void shouldSimulateQueueBehavior() {
        // Given
        MyQueue queue = new MyQueue();

        // When
        queue.push(1);
        queue.push(2);

        // Then
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
    }

    @Test
    void shouldHandleMultipleOperationsInOrder() {
        // Given
        MyQueue queue = new MyQueue();

        // When
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        var first = queue.pop();
        queue.push(5);
        var second = queue.pop();
        var third = queue.pop();
        var fourth = queue.pop();
        var fifth = queue.pop();

        // Then
        assertEquals(1, first);
        assertEquals(2, second);
        assertEquals(3, third);
        assertEquals(4, fourth);
        assertEquals(5, fifth);
    }
}