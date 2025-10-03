package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.GraphNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

// TC: O(m * n), SC: O(m * n)
class CloneGraph {

    static GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }

        Map<GraphNode, GraphNode> cloned = new HashMap<>();
        Queue<GraphNode> queue = new ArrayDeque<>();

        queue.add(node);
        cloned.put(node, new GraphNode(node.val));

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();

            for (GraphNode neighbor : current.neighbors) {
                if (!cloned.containsKey(neighbor)) {
                    cloned.put(neighbor, new GraphNode(neighbor.val));
                    queue.add(neighbor);
                }

                cloned.get(current).neighbors.add(cloned.get(neighbor));
            }
        }

        return cloned.get(node);
    }
}
