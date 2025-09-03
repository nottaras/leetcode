package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;

//TC: O(n), SC: O(1)
class LinkedListCycle {

    static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
