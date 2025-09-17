package com.zadziarnouski.leetcode;


class SortColors {

    // Bubble Sort implementation
    // TC: O(n^2), SC: O(1)
    static void bubbleSort(int[] nums) {
        boolean swapped;
        int n = nums.length;

        do {
            swapped = false;

            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }

            n--;
        } while (swapped);
    }

    // Selection Sort implementation
    // TC: O(n^2), SC: O(1)
    static void selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
