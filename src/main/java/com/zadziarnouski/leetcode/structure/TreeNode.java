package com.zadziarnouski.leetcode.structure;

import java.util.Objects;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode of(Integer... values) {
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

    public static TreeNode rightSkewed(int... values) {
        if (values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        TreeNode current = root;

        for (int i = 1; i < values.length; i++) {
            current.right = new TreeNode(values[i]);
            current = current.right;
        }

        return root;
    }

    public static TreeNode leftSkewed(int... values) {
        if (values.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        TreeNode current = root;

        for (int i = 1; i < values.length; i++) {
            current.left = new TreeNode(values[i]);
            current = current.left;
        }

        return root;
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
