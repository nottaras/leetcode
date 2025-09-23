package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInBSTTest {

    @Test
    void givenBalancedBST_whenFindKthSmallest_thenCorrect() {
        // given
        TreeNode root = TreeNode.of(3,1,4,null,2);

        // when
        int result = KthSmallestElementInBST.kthSmallest(root, 1);

        // then
        assertEquals(1, result);
    }

    @Test
    void givenLeftSkewedTree_whenFindKthSmallest_thenCorrect() {
        // given
        TreeNode root = TreeNode.leftSkewed(5,4,3,2,1);

        // when
        int result = KthSmallestElementInBST.kthSmallest(root, 3);

        // then
        assertEquals(3, result);
    }

    @Test
    void givenSingleElementTree_whenFindKthSmallest_thenCorrect() {
        // given
        TreeNode root = TreeNode.of(2147483647);

        // when
        int result = KthSmallestElementInBST.kthSmallest(root, 1);

        // then
        assertEquals(2147483647, result);
    }

    @Test
    void givenRightSkewedTree_whenFindKthSmallest_thenCorrect() {
        // given
        TreeNode root = TreeNode.rightSkewed(1,2,3,4);

        // when
        int result = KthSmallestElementInBST.kthSmallest(root, 4);

        // then
        assertEquals(4, result);
    }
}