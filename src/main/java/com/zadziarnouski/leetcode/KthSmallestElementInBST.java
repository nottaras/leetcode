package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(h + k), SC: O(h)
class KthSmallestElementInBST {

    static int kthSmallest(TreeNode root, int k) {
        int[] result = new int[1];
        int[] counter = new int[]{k};
        inorder(root, counter, result);
        return result[0];
    }

    private static void inorder(TreeNode node, int[] k, int[] result) {
        if (node == null) return;

        inorder(node.left, k, result);

        k[0]--;
        if (k[0] == 0) {
            result[0] = node.val;
            return;
        }

        inorder(node.right, k, result);
    }
}
