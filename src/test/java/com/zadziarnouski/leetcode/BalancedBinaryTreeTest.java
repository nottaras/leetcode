package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.BalancedBinaryTree.isBalanced;
import static com.zadziarnouski.leetcode.structure.TreeNode.of;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {

    @Test
    void shouldReturnTrueForBalancedBinaryTree() {
//        Given
        var root = of(3, 9, 20, 15, 7);

//        When & Then
        assertTrue(isBalanced(root));
    }
}