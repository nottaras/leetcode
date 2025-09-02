package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import com.zadziarnouski.leetcode.util.ListNodeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    @Test
    void shouldReverseListWithMultipleElements() {
        // Given
        ListNode head = ListNode.of(1, 2, 3, 4, 5);

        // When
        ListNode reversed = ReverseLinkedList.reverseList(head);

        // Then
        assertEquals("5->4->3->2->1->null", ListNodeUtil.toString(reversed));
    }

    @Test
    void shouldHandleSingleElementList() {
        // Given
        ListNode head = ListNode.of(42);

        // When
        ListNode reversed = ReverseLinkedList.reverseList(head);

        // Then
        assertEquals("42->null", ListNodeUtil.toString(reversed));
    }

    @Test
    @SuppressWarnings("ConstantConditions")
    void shouldHandleEmptyList() {
        // Given
        ListNode head = null;

        // When
        ListNode reversed = ReverseLinkedList.reverseList(head);

        // Then
        assertNull(reversed);
    }
}