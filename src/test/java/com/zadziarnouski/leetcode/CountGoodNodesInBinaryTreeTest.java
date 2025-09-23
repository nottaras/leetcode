package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTreeTest {

    @Test
    void shouldCountGoodNodes_case1() {
        // given
        TreeNode root = TreeNode.of(3, 1, 4, null, null, 1, 5);

        // when
        int result = CountGoodNodesInBinaryTree.goodNodes(root);

        // then
        assertEquals(3, result);
    }

    @Test
    void shouldCountGoodNodes_case2() {
        // given
        TreeNode root = TreeNode.of(3, 3, null, 4, 2);

        // when
        int result = CountGoodNodesInBinaryTree.goodNodes(root);

        // then
        assertEquals(3, result);
    }

    @Test
    void shouldCountGoodNodes_case3() {
        // given
        TreeNode root = TreeNode.of(1);

        // when
        int result = CountGoodNodesInBinaryTree.goodNodes(root);

        // then
        assertEquals(1, result);
    }
}