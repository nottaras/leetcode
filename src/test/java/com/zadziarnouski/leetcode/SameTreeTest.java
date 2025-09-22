package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SameTreeTest {

    @Test
    void givenIdenticalTrees_whenCheckIsSameTree_thenReturnTrue() {
        // given
        TreeNode p = TreeNode.of(1, 2, 3);
        TreeNode q = TreeNode.of(1, 2, 3);

        // when
        boolean result = SameTree.isSameTree(p, q);

        // then
        assertTrue(result);
    }

    @Test
    void givenDifferentStructureTrees_whenCheckIsSameTree_thenReturnFalse() {
        // given
        TreeNode p = TreeNode.of(1, 2);
        TreeNode q = TreeNode.of(1, null, 2);

        // when
        boolean result = SameTree.isSameTree(p, q);

        // then
        assertFalse(result);
    }

    @Test
    void givenDifferentValueTrees_whenCheckIsSameTree_thenReturnFalse() {
        // given
        TreeNode p = TreeNode.of(1, 2, 1);
        TreeNode q = TreeNode.of(1, 1, 2);

        // when
        boolean result = SameTree.isSameTree(p, q);

        // then
        assertFalse(result);
    }

    @Test
    @SuppressWarnings("ConstantConditions")
    void givenBothNullTrees_whenCheckIsSameTree_thenReturnTrue() {
        // given
        TreeNode p = null;
        TreeNode q = null;

        // when
        boolean result = SameTree.isSameTree(p, q);

        // then
        assertTrue(result);
    }

    @Test
    void givenOneNullTree_whenCheckIsSameTree_thenReturnFalse() {
        // given
        TreeNode p = TreeNode.of(1);
        TreeNode q = null;

        // when
        boolean result = SameTree.isSameTree(p, q);

        // then
        assertFalse(result);
    }
}