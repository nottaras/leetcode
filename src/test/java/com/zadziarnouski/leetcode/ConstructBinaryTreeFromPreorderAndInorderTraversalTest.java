package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.SameTree.isSameTree;
import static com.zadziarnouski.leetcode.util.TreeNodeUtil.n;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    void givenRegularTree_whenBuildTree_thenCorrect() {
        // given
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        // when
        TreeNode result = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        // then
        TreeNode expected = n(3,
                n(9),
                n(20, n(15), n(7))
        );
        assertTrue(isSameTree(expected, result));
    }

    @Test
    void givenSingleNode_whenBuildTree_thenCorrect() {
        // given
        int[] preorder = {1};
        int[] inorder = {1};

        // when
        TreeNode result = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        // then
        TreeNode expected = n(1);
        assertTrue(isSameTree(expected, result));
    }

    @Test
    void givenEmptyArrays_whenBuildTree_thenReturnNull() {
        // given
        int[] preorder = {};
        int[] inorder = {};

        // when
        TreeNode result = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        // then
        assertNull(result);
    }

    @Test
    void givenLeftSkewedTree_whenBuildTree_thenCorrect() {
        // given
        int[] preorder = {3, 2, 1};
        int[] inorder = {1, 2, 3};

        // when
        TreeNode result = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        // then
        TreeNode expected = n(3,
                n(2,
                        n(1),
                        null
                ),
                null
        );
        assertTrue(isSameTree(expected, result));
    }

    @Test
    void givenRightSkewedTree_whenBuildTree_thenCorrect() {
        // given
        int[] preorder = {1, 2, 3};
        int[] inorder = {1, 2, 3};

        // when
        TreeNode result = ConstructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        // then
        TreeNode expected = n(1,
                null,
                n(2,
                        null,
                        n(3)
                )
        );
        assertTrue(isSameTree(expected, result));
    }
}