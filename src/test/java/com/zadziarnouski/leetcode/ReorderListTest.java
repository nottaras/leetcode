package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.util.ListNodeUtil.toArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReorderListTest {

    @Test
    void shouldReorderList_evenLength() {
        // given
        ListNode head = ListNode.of(1, 2, 3, 4);

        // when
        ReorderList.reorderList(head);

        // then
        assertArrayEquals(new int[]{1, 4, 2, 3}, toArray(head));
    }

    @Test
    void shouldReorderList_oddLength() {
        // given
        ListNode head = ListNode.of(1, 2, 3, 4, 5);

        // when
        ReorderList.reorderList(head);

        // then
        assertArrayEquals(new int[]{1, 5, 2, 4, 3}, toArray(head));
    }

    @Test
    void shouldHandleSingleNode() {
        // given
        ListNode head = ListNode.of(1);

        // when
        ReorderList.reorderList(head);

        // then
        assertArrayEquals(new int[]{1}, toArray(head));
    }

    @Test
    void shouldHandleEmptyList() {
        // given
        ListNode head = null;

        // when
        ReorderList.reorderList(head);

        // then
        assertNull(head);
    }
}