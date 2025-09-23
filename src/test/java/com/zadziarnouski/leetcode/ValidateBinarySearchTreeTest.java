package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @Test
    void should_returnTrue_when_validBST() {
        // given
        TreeNode root = TreeNode.of(2, 1, 3);

        // when
        boolean result = ValidateBinarySearchTree.isValidBST(root);

        // then
        assertTrue(result);
    }

    @Test
    void should_returnFalse_when_notBST_dueToLeft() {
        // given
        TreeNode root = TreeNode.of(5, 1, 4, null, null, 3, 6);

        // when
        boolean result = ValidateBinarySearchTree.isValidBST(root);

        // then
        assertFalse(result);
    }

    @Test
    void should_returnTrue_when_singleNode() {
        // given
        TreeNode root = TreeNode.of(2147483647);

        // when
        boolean result = ValidateBinarySearchTree.isValidBST(root);

        // then
        assertTrue(result);
    }

    @Test
    void should_returnFalse_when_violatesRightSubtree() {
        // given
        TreeNode root = TreeNode.of(10, 5, 15, null, null, 6, 20);

        // when
        boolean result = ValidateBinarySearchTree.isValidBST(root);

        // then
        assertFalse(result);
    }
}