package com.zadziarnouski.leetcode.util;

import com.zadziarnouski.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

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

    public static int[] toArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
