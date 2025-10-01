package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.List;

class Permutations {

    static List<List<Integer>> permute(int[] nums) {
        return helper(0, nums);
    }

    private static List<List<Integer>> helper(int index, int[] nums) {
        if (index == nums.length) {
            return List.of(new ArrayList<>());
        }

        int current = nums[index];
        List<List<Integer>> prevPermutation = helper(index + 1, nums);
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> perm : prevPermutation) {
            for (int i = 0; i <= perm.size(); i++) {
                ArrayList<Integer> newPerm = new ArrayList<>(perm);
                newPerm.add(i, current);
                result.add(newPerm);
            }
        }

        return result;
    }
}
