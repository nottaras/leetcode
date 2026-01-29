package com.zadziarnouski.leetcode.util;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ArrayUtil {

    private ArrayUtil() {
    }

    public static void assertFirstKDoesNotContain(int[] nums, int k, int forbidden) {
        for (int i = 0; i < k; i++) {
            assertNotEquals(forbidden, nums[i], "nums[" + i + "] should not be equal to " + forbidden);
        }
    }
}
