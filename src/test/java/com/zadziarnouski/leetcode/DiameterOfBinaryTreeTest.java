package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.util.TreeNodeUtil.n;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfBinaryTreeTest {

    @Test
    void shouldReturnZero_whenTreeIsEmpty() {
        // Given
        TreeNode root = null;

        // When
        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        // Then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZero_whenTreeHasSingleNode() {
        // Given
        TreeNode root = n(1);

        // When
        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        // Then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnNMinusOne_whenTreeIsLeftSkewedLine() {
        // Given
        //       1
        //      /
        //     2
        //    /
        //   3
        //  /
        // 4
        TreeNode root = n(1);
        root.left = n(2);
        root.left.left = n(3);
        root.left.left.left = n(4);

        // When
        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        // Then
        assertEquals(3, result);
    }

    @Test
    void shouldReturnDiameter_whenPathDoesNotPassThroughRoot() {
        // Given:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        //        /
        //       6
        TreeNode root = n(1);
        root.left = n(2);
        root.right = n(3);
        root.left.left = n(4);
        root.left.right = n(5);
        root.left.right.left = n(6);

        // When
        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        // Then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnDiameter_whenTreeIsBalanced() {
        // Given:
        //           1
        //         /   \
        //        2     3
        //       / \   / \
        //      4   5 6   7
        TreeNode root = n(1);
        root.left = n(2);
        root.right = n(3);
        root.left.left = n(4);
        root.left.right = n(5);
        root.right.left = n(6);
        root.right.right = n(7);

        // When
        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        // Then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnDiameter_whenOneSideDeeperThanOther() {
        // Given:
        //         1
        //        / \
        //       2   3
        //      /
        //     4
        //    /
        //   5
        TreeNode root = n(1);
        root.left = n(2);
        root.right = n(3);
        root.left.left = n(4);
        root.left.left.left = n(5);

        // When
        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        // Then
        assertEquals(4, result);
    }
}