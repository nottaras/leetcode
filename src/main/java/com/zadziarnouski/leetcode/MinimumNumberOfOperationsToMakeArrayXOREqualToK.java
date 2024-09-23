package com.zadziarnouski.leetcode;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMakeArrayXOREqualToK {

    static int minOperations(int[] nums, int k) {
        int array = Arrays.stream(nums).reduce((x, y) -> x ^ y).orElse(0);
        if (array == k) {
            return 0;
        }

        String binaryStringOfArray = Integer.toBinaryString(array);
        String binaryStringOfK = Integer.toBinaryString(k);

        if (binaryStringOfArray.length() < binaryStringOfK.length()) {
            binaryStringOfArray = padZeroes(binaryStringOfArray, binaryStringOfK.length() - binaryStringOfArray.length());
        } else if (binaryStringOfK.length() < binaryStringOfArray.length()) {
            binaryStringOfK = padZeroes(binaryStringOfK, binaryStringOfArray.length() - binaryStringOfK.length());
        }

        int count = 0;
        for (int i = 0; i < binaryStringOfArray.length(); i++) {
            if (binaryStringOfArray.charAt(i) != binaryStringOfK.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    private static String padZeroes(String str, int length) {
        return "0".repeat(Math.max(0, length)) + str;
    }
}
