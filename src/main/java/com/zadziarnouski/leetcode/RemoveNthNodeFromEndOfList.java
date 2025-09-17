package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;

class RemoveNthNodeFromEndOfList {

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            second = second.next;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}
