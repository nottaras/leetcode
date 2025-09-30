package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TC: O(n * 2^n), SC: O(n)
class SubsetsII {

    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void dfs(int i, int[] nums, List<Integer> path, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[i]);
        dfs(i + 1, nums, path, res);

        path.removeLast();

        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        dfs(i + 1, nums, path, res);
    }
}
