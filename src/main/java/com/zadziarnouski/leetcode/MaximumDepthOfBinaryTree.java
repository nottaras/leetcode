package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

class MaximumDepthOfBinaryTree {

    // TC: O(n), SC: O(n)
    @SuppressWarnings("all")
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }

        return depth;
    }
}

/* Recursive DFS implementation
    // TC: O(n), SC: O(1)
    static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
*/
