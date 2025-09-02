package com.zadziarnouski.leetcode.util;

import com.zadziarnouski.leetcode.structure.ListNode;

public class ListNodeUtil {

    private ListNodeUtil() {
    }

    public static String toString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }
        return sb.append("null").toString();
    }
}
