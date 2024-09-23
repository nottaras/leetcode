package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.InvertBinaryTree.invertTree;
import static com.zadziarnouski.leetcode.structure.TreeNode.createTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertBinaryTreeTest {

    @Test
    void shouldInvertBinaryTreeCorrectly() {
        //Given
        var given = createTree(4, 2, 7, 1, 3, 6, 9);
        var expected = createTree(4, 7, 2, 9, 6, 3, 1);

        //When & Then
        assertEquals(expected, invertTree(given));
    }
}
