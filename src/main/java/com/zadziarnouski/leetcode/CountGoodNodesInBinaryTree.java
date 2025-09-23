package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(n), SC: O(n)
class CountGoodNodesInBinaryTree {

    static int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private static int dfs(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int good = node.val >= maxSoFar ? 1 : 0;
        int newMax = Math.max(maxSoFar, node.val);

        return good + dfs(node.left, newMax) + dfs(node.right, newMax);
    }
}
