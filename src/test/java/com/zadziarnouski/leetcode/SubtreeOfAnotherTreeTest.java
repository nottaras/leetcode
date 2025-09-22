package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeOfAnotherTreeTest {

    @Test
    void givenSubtreeIsPresent_whenSearchSubtree_thenReturnsTrue() {
        // given
        TreeNode root = TreeNode.of(3, 4, 5, 1, 2);
        TreeNode subRoot = TreeNode.of(4, 1, 2);

        // when
        boolean result = SubtreeOfAnotherTree.isSubtree(root, subRoot);

        // then
        assertTrue(result);
    }

    @Test
    void givenSubtreeIsNotPresent_whenSearchSubtree_thenReturnsFalse() {
        // given
        TreeNode root = TreeNode.of(3, 4, 5, 1, 2, null, null, null, null, 0);
        TreeNode subRoot = TreeNode.of(4, 1, 2);

        // when
        boolean result = SubtreeOfAnotherTree.isSubtree(root, subRoot);

        // then
        assertFalse(result);
    }

    @Test
    void givenSameTree_whenSearchSubtree_thenReturnsTrue() {
        // given
        TreeNode root = TreeNode.of(1, 2, 3);
        TreeNode subRoot = TreeNode.of(1, 2, 3);

        // when
        boolean result = SubtreeOfAnotherTree.isSubtree(root, subRoot);

        // then
        assertTrue(result);
    }
}