package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

// TC: O(n), SC: O(n)
class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length - 1,
                0, inorder.length - 1, inorderIndexMap);
    }

    private static TreeNode build(int[] preorder, int preStart, int preEnd,
                                  int inStart, int inEnd, Map<Integer, Integer> inorderIndexMap) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int rootIndexInInorder = inorderIndexMap.get(rootVal);
        int leftSize = rootIndexInInorder - inStart;

        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inStart, rootIndexInInorder - 1, inorderIndexMap);

        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                rootIndexInInorder + 1, inEnd, inorderIndexMap);

        return root;
    }
}
