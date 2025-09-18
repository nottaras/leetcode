package com.zadziarnouski.leetcode.util;

import com.zadziarnouski.leetcode.structure.Node;

public class NodeUtil {

    private NodeUtil() {
    }

    public static boolean areListsEqual(Node a, Node b) {
        while (a != null && b != null) {
            if (a == b || a.val != b.val) {
                return false;
            }

            if ((a.random == null) != (b.random == null) ||
                (a.random != null && (a.random == b.random || a.random.val != b.random.val))) {
                return false;
            }

            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }
}
