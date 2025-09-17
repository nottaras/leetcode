package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.util.ListNodeUtil.toArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void givenList12345_whenRemove2ndFromEnd_thenResultIs1235() {
        // given
        ListNode head = ListNode.of(1, 2, 3, 4, 5);

        // when
        ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 2);

        // then
        assertArrayEquals(new int[]{1, 2, 3, 5}, toArray(result));
    }

    @Test
    void givenSingleNode_whenRemove1stFromEnd_thenResultIsEmpty() {
        // given
        ListNode head = ListNode.of(1);

        // when
        ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        // then
        assertNull(result);
    }

    @Test
    void givenList12_whenRemove2ndFromEnd_thenResultIs2() {
        // given
        ListNode head = ListNode.of(1, 2);

        // when
        ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 2);

        // then
        assertArrayEquals(new int[]{2}, toArray(result));
    }

    @Test
    void givenList12_whenRemove1stFromEnd_thenResultIs1() {
        // given
        ListNode head = ListNode.of(1, 2);

        // when
        ListNode result = RemoveNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        // then
        assertArrayEquals(new int[]{1}, toArray(result));
    }
}