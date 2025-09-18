package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.Node;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.util.NodeUtil.areListsEqual;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CopyListWithRandomPointerTest {

    @Test
    @SuppressWarnings("all")
    void givenEmptyList_whenCopy_thenReturnNull() {
        // given
        Node head = null;

        // when
        Node copied = CopyListWithRandomPointer.copyRandomList(head);

        // then
        assertNull(copied);
    }

    @Test
    void givenSingleNode_whenCopy_thenCopyCorrectly() {
        // given
        Node node = new Node(1);
        node.random = node;

        // when
        Node copied = CopyListWithRandomPointer.copyRandomList(node);

        // then
        assertTrue(areListsEqual(node, copied));
    }

    @Test
    void givenMultipleNodesWithRandom_whenCopy_thenCopyCorrectly() {
        // given
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n1.random = n3;
        n2.random = n1;
        n3.random = n2;

        // when
        Node copied = CopyListWithRandomPointer.copyRandomList(n1);

        // then
        assertTrue(areListsEqual(n1, copied));
    }

}