package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KClosestPointsToOriginTest {

    @Test
    void shouldReturnKClosestPoints_case1() {
        // given
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;

        // when
        int[][] result = KClosestPointsToOrigin.kClosest(points, k);

        // then
        assertArrayEquals(new int[][]{{-2, 2}}, result);
    }

    @Test
    void shouldReturnKClosestPoints_case2() {
        // given
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        // when
        int[][] result = KClosestPointsToOrigin.kClosest(points, k);

        // then
        assertTrue(
                (arrayContains(result, new int[]{3, 3}) && arrayContains(result, new int[]{-2, 4})) ||
                (arrayContains(result, new int[]{-2, 4}) && arrayContains(result, new int[]{3, 3}))
        );
    }

    @Test
    void shouldReturnAllPointsIfKEqualsPointsLength() {
        // given
        int[][] points = {{2, 2}, {1, 1}, {0, 0}};
        int k = 3;

        // when
        int[][] result = KClosestPointsToOrigin.kClosest(points, k);

        // then
        assertEquals(3, result.length);
        assertTrue(arrayContains(result, new int[]{2, 2}));
        assertTrue(arrayContains(result, new int[]{1, 1}));
        assertTrue(arrayContains(result, new int[]{0, 0}));
    }

    private boolean arrayContains(int[][] arr, int[] target) {
        for (int[] point : arr) {
            if (point[0] == target[0] && point[1] == target[1]) {
                return true;
            }
        }

        return false;
    }

}