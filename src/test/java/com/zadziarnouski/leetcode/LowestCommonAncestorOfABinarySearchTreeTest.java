package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor;
import static com.zadziarnouski.leetcode.structure.TreeNode.createTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    void shouldReturnLowestCommonAncestor() {
        //Given
        var given = createTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        var expected = createTree(6);

        //When
        var actual = lowestCommonAncestor(given, new TreeNode(2), new TreeNode(8));

        //Then
        assertEquals(expected.val, actual.val);
    }
}