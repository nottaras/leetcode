package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.structure.GraphNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CloneGraphTest {

    @Test
    @SuppressWarnings("all")
    void givenNull_whenCloneGraph_thenReturnNull() {
        // Given
        GraphNode input = null;

        // When
        GraphNode result = CloneGraph.cloneGraph(input);

        // Then
        assertNull(result);
    }

    @Test
    void givenSingleNode_whenCloneGraph_thenReturnClonedNode() {
        // Given
        GraphNode GraphNode = new GraphNode(1);

        // When
        GraphNode clone = CloneGraph.cloneGraph(GraphNode);

        // Then
        assertNotSame(GraphNode, clone);
        assertEquals(1, clone.val);
        assertTrue(clone.neighbors.isEmpty());
    }

    @Test
    void givenTwoConnectedNodes_whenCloneGraph_thenReturnClonedGraph() {
        // Given
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        // When
        GraphNode clone = CloneGraph.cloneGraph(node1);

        // Then
        assertNotSame(node1, clone);
        assertEquals(1, clone.val);
        assertEquals(1, clone.neighbors.size());

        GraphNode neighbor = clone.neighbors.getFirst();
        assertEquals(2, neighbor.val);
        assertEquals(1, neighbor.neighbors.size());
        assertEquals(1, neighbor.neighbors.getFirst().val);
    }

    @Test
    void givenCycle_whenCloneGraph_thenReturnClonedCycle() {
        // Given:
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        node1.neighbors.add(node2);
        node2.neighbors.add(node3);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);

        // When
        GraphNode clone = CloneGraph.cloneGraph(node1);

        // Then
        assertNotSame(node1, clone);
        assertEquals(1, clone.val);
        assertEquals(1, clone.neighbors.size());
        assertEquals(2, clone.neighbors.getFirst().val);
    }
}