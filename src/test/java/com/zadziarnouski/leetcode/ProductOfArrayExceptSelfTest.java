package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {


    @Test
    void shouldReturnProductExceptSelf_whenAllPositiveNumbers() {
        // given
        int[] input = {1, 2, 3, 4};

        // when
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);

        // then
        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @Test
    void shouldReturnProductExceptSelf_whenArrayContainsOneZero() {
        // given
        int[] input = {1, 2, 0, 4};

        // when
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);

        // then
        assertArrayEquals(new int[]{0, 0, 8, 0}, result);
    }

    @Test
    void shouldReturnProductExceptSelf_whenArrayContainsTwoZeros() {
        // given
        int[] input = {0, 1, 0, 3};

        // when
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);

        // then
        assertArrayEquals(new int[]{0, 0, 0, 0}, result);
    }

    @Test
    void shouldReturnProductExceptSelf_whenArrayHasNegativeNumbers() {
        // given
        int[] input = {-1, 2, -3, 4};

        // when
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);

        // then
        assertArrayEquals(new int[]{-24, 12, -8, 6}, result);
    }
}