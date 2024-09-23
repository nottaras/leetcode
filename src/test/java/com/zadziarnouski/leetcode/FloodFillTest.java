package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.FloodFill.floodFill;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class FloodFillTest {

    @Test
    void shouldFillImageCorrectly() {
        //Given
        int[][] image =
                {
                        {1, 1, 1},
                        {1, 1, 0},
                        {1, 0, 1}
                };
        int sr = 1, sc = 1, color = 2;

        int[][] expected =
                {
                        {2, 2, 2},
                        {2, 2, 0},
                        {2, 0, 1}
                };

        //When
        int[][] actual = floodFill(image, sr, sc, color);

        //Then
        assertArrayEquals(expected, actual);
    }
}