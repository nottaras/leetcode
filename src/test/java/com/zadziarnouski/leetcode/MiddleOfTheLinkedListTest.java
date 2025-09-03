package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {

    @Test
    void shouldReturnMiddle_whenListHasOddNumberOfNodes() {
        // Given
        var head = ListNode.of(1, 2, 3, 4, 5);

        // When
        var middle = MiddleOfTheLinkedList.middleNode(head);

        // Then
        assertEquals(3, middle.val);
    }

    @Test
    void shouldReturnSecondMiddle_whenListHasEvenNumberOfNodes() {
        // Given
        var head = ListNode.of(1, 2, 3, 4, 5, 6);

        // When
        var middle = MiddleOfTheLinkedList.middleNode(head);

        // Then
        assertEquals(4, middle.val);
    }

    @Test
    void shouldReturnHead_whenListHasSingleNode() {
        // Given
        var head = ListNode.of(42);

        // When
        var middle = MiddleOfTheLinkedList.middleNode(head);

        // Then
        assertEquals(42, middle.val);
    }

    @Test
    void shouldReturnMiddle_whenListHasTwoNodes() {
        // Given
        var head = ListNode.of(7, 9);

        // When
        var middle = MiddleOfTheLinkedList.middleNode(head);

        // Then
        assertEquals(9, middle.val);
    }
}
