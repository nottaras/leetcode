package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddTwoNumbersTest {

    @Test
    void givenTwoLists_whenAddTwoNumbers_thenCorrectSum() {
        // given
        ListNode l1 = ListNode.of(2, 4, 3); // 342
        ListNode l2 = ListNode.of(5, 6, 4); // 465

        // when
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2); // 807

        // then
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void givenCarryOver_whenAddTwoNumbers_thenHandleCarry() {
        // given
        ListNode l1 = ListNode.of(9, 9);    // 99
        ListNode l2 = new ListNode(1);          // 1

        // when
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2); // 100

        // then
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void givenDifferentLengths_whenAddTwoNumbers_thenCorrectSum() {
        // given
        ListNode l1 = ListNode.of(1, 8);    // 81
        ListNode l2 = new ListNode(0);          // 0

        // when
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2); // 81

        // then
        assertEquals(1, result.val);
        assertEquals(8, result.next.val);
        assertNull(result.next.next);
    }
}