package com.zadziarnouski.leetcode.util;

import com.zadziarnouski.leetcode.structure.TreeNode;

public class TreeNodeUtil {

    private TreeNodeUtil() {
    }

    public static TreeNode n(int v) {
        return new TreeNode(v);
    }

    public static TreeNode n(int v, TreeNode left, TreeNode right) {
        TreeNode node = new TreeNode(v);
        node.left = left;
        node.right = right;
        return node;
    }
}
