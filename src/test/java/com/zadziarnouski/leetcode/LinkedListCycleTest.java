package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {

    @Test
    void shouldReturnTrue_whenCycleExists() {
        // Given
        ListNode list = ListNode.createList(1, 2, 3, 4, 5);
        ListNode tail = list;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = list.next;

        // When & Then
        assertTrue(LinkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnFalse_whenNoCycle() {
        // Given
        ListNode list = ListNode.createList(1, 2, 3, 4, 5);

        // When & Then
        assertFalse(LinkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnFalse_whenSingleElementWithoutCycle() {
        // Given
        ListNode list = new ListNode(1);

        // When & Then
        assertFalse(LinkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnTrue_whenSingleElementWithCycle() {
        // Given
        ListNode list = new ListNode(1);
        list.next = list;

        // When & Then
        assertTrue(LinkedListCycle.hasCycle(list));
    }

    @Test
    void shouldReturnFalse_whenListIsEmpty() {
        // When & Then
        assertFalse(LinkedListCycle.hasCycle(null));
    }
}