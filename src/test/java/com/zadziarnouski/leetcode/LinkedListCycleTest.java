package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void hasCycle_whenCycleExists_shouldReturnTrue() {
        ListNode list = ListNode.createList(1, 2, 3, 4, 5);
        ListNode tail = list;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = list.next;

        assertTrue(LinkedListCycle.hasCycle(list));
    }

    @Test
    void hasCycle_whenNoCycle_shouldReturnFalse() {
        ListNode list = ListNode.createList(1, 2, 3, 4, 5);

        assertFalse(LinkedListCycle.hasCycle(list));
    }

    @Test
    void hasCycle_whenSingleElementNoCycle_shouldReturnFalse() {
        ListNode list = new ListNode(1);

        assertFalse(LinkedListCycle.hasCycle(list));
    }

    @Test
    void hasCycle_whenSingleElementCycle_shouldReturnTrue() {
        ListNode list = new ListNode(1);
        list.next = list;

        assertTrue(LinkedListCycle.hasCycle(list));
    }

    @Test
    void hasCycle_whenEmptyList_shouldReturnFalse() {
        assertFalse(LinkedListCycle.hasCycle(null));
    }
}