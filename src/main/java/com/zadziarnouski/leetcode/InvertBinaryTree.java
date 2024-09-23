package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

public class InvertBinaryTree {

    static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}


