package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    @Test
    void shouldReturnZeroForNullRoot() {
        // given
        TreeNode root = TreeNode.createTree();

        // when
        int depth = MaximumDepthOfBinaryTree.maxDepth(root);

        // then
        assertEquals(0, depth);
    }

    @Test
    void shouldReturnOneForSingleNode() {
        // given
        TreeNode root = TreeNode.createTree(1);

        // when
        int depth = MaximumDepthOfBinaryTree.maxDepth(root);

        // then
        assertEquals(1, depth);
    }

    @Test
    void shouldReturnCorrectDepthForBalancedTree() {
        // given
        TreeNode root = TreeNode.createTree(1, 2, 3);

        // when
        int depth = MaximumDepthOfBinaryTree.maxDepth(root);

        // then
        assertEquals(2, depth);
    }

    @Test
    void shouldReturnCorrectDepthForUnbalancedTree() {
        // given
        TreeNode root = TreeNode.createTree(1, 2, null, 3, null, null, null, 4);

        // when
        int depth = MaximumDepthOfBinaryTree.maxDepth(root);

        // then
        assertEquals(4, depth);
    }
}