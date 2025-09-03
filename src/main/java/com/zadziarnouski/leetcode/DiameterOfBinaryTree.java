package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(n), SC: O(n)
class DiameterOfBinaryTree {
    static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        dfs(root, diameter);

        return diameter[0];
    }

    private static int dfs(TreeNode root, int[] diameter) {
        if (root == null) {
            return 0;
        }

        int leftHeight = dfs(root.left, diameter);
        int rightHeight = dfs(root.right, diameter);
        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
