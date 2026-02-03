package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.List;

//TC: O(n), SC: O(1)
class FindAllNumbersDisappearedInArray {

    static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]);
            int index = value - 1;

            nums[index] = -Math.abs(nums[index]);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
