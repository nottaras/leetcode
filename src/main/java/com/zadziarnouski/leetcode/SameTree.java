package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

// TC: O(n), SC: O(n)
class SameTree {

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(q.right, p.right);
    }
}
