package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;

// TC: O(n), SC: O(1)
class MiddleOfTheLinkedList {

    static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
