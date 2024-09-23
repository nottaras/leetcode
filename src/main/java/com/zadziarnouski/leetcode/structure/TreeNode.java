package com.zadziarnouski.leetcode.structure;

import java.util.Objects;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode createTree(Integer... values) {
        return buildTreeFromArray(values, 0);
    }

    private static TreeNode buildTreeFromArray(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }

        TreeNode node = new TreeNode(values[index]);
        node.left = buildTreeFromArray(values, 2 * index + 1);
        node.right = buildTreeFromArray(values, 2 * index + 2);
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;

        return Objects.equals(val, treeNode.val)
                && Objects.equals(left, treeNode.left)
                && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
