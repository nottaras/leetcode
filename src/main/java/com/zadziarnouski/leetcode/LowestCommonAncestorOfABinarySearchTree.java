package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(h), SC: O(h)
class LowestCommonAncestorOfABinarySearchTree {

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
