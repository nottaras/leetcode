package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PacificAtlanticWaterFlowTest {

    @Test
    void givenSimpleMatrix_whenPacificAtlantic_thenCorrectCells() {
        // given
        int[][] input = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        // when
        List<List<Integer>> result = PacificAtlanticWaterFlow.pacificAtlantic(input);

        // then
        assertEquals(7, result.size());
        assertTrue(result.contains(List.of(0, 4)));
        assertTrue(result.contains(List.of(1, 3)));
        assertTrue(result.contains(List.of(1, 4)));
        assertTrue(result.contains(List.of(2, 2)));
        assertTrue(result.contains(List.of(3, 0)));
        assertTrue(result.contains(List.of(3, 1)));
        assertTrue(result.contains(List.of(4, 0)));
    }

    @Test
    void givenFlatMatrix_whenPacificAtlantic_thenAllCells() {
        // given
        int[][] input = {
                {1, 1},
                {1, 1}
        };

        // when
        List<List<Integer>> result = PacificAtlanticWaterFlow.pacificAtlantic(input);

        // then
        assertEquals(4, result.size());
        assertTrue(result.contains(List.of(0, 0)));
        assertTrue(result.contains(List.of(0, 1)));
        assertTrue(result.contains(List.of(1, 0)));
        assertTrue(result.contains(List.of(1, 1)));
    }

    @Test
    void givenSingleCell_whenPacificAtlantic_thenThatCell() {
        // given
        int[][] input = {
                {42}
        };

        // when
        List<List<Integer>> result = PacificAtlanticWaterFlow.pacificAtlantic(input);

        // then
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(0, 0)));
    }
}