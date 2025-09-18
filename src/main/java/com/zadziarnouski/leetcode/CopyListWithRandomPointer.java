package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.Node;

import java.util.HashMap;
import java.util.Map;

// TC: O(n), SC: O(n)
class CopyListWithRandomPointer {

    static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {
            Node clone = map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
