package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeRightSideViewTest {

    @Test
    void given_balancedTree_when_rightSideView_then_returnCorrectView() {
        // given
        TreeNode root = TreeNode.of(1, 2, 3, null, 5, null, 4);

        // when
        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        // then
        assertEquals(List.of(1, 3, 4), result);
    }

    @Test
    void given_leftSkewedTree_when_rightSideView_then_returnRightmostNodes() {
        // given
        TreeNode root = TreeNode.of(1, 2, null, 3);

        // when
        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        // then
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    void given_singleNodeTree_when_rightSideView_then_returnSingleNode() {
        // given
        TreeNode root = TreeNode.of(1);

        // when
        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        // then
        assertEquals(List.of(1), result);
    }

    @Test
    void given_emptyTree_when_rightSideView_then_returnEmptyList() {
        // given
        TreeNode root = TreeNode.of();

        // when
        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        // then
        assertEquals(List.of(), result);
    }
}