package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.ListNode;

class AddTwoNumbers {

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int digit = carry;

            if (l1 != null) {
                digit += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digit += l2.val;
                l2 = l2.next;
            }

            cur.next = new ListNode(digit % 10);
            cur = cur.next;
            carry = digit / 10;
        }

        if (carry > 0) {
            cur.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
