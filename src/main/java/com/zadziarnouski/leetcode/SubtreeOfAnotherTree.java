package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(n * m), SC: O(n)
class SubtreeOfAnotherTree {

    static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        // reuse previous solution
        if (SameTree.isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
