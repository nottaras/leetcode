package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(n), SC: O(h)
class BalancedBinaryTree {

    static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return dfs(root) != -1;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
