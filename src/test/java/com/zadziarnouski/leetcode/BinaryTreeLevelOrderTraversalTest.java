package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void givenBalancedTree_whenLevelOrder_thenReturnCorrectLevels() {
        // given
        TreeNode root = TreeNode.of(3, 9, 20, 15, 7);

        // when
        var result = BinaryTreeLevelOrderTraversal.levelOrder(root);

        // then
        assertEquals(List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        ), result);
    }

    @Test
    void givenSingleNode_whenLevelOrder_thenReturnSingleLevel() {
        // given
        TreeNode root = new TreeNode(1);

        // when
        var result = BinaryTreeLevelOrderTraversal.levelOrder(root);

        // then
        assertEquals(List.of(List.of(1)), result);
    }

    @Test
    void givenEmptyTree_whenLevelOrder_thenReturnEmptyList() {
        // given
        TreeNode root = null;

        // when
        var result = BinaryTreeLevelOrderTraversal.levelOrder(root);

        // then
        assertTrue(result.isEmpty());
    }
}