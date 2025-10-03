package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// TC: O(n), SC: O(n)
class BinaryTreeLevelOrderTraversal {

    @SuppressWarnings("all")
    static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        List<List<Integer>> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                currentLevel.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}
