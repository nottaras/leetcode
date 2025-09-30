package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.List;

// TC: O(C(n, k) * k), SC: O(k)
class CombinationSum {

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(0, new ArrayList<>(), result, candidates, target);

        return result;
    }

    private static void dfs(int i, List<Integer> cur, List<List<Integer>> result, int[] candidates, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
        }
        if (target < 0) {
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            cur.add(candidates[j]);
            dfs(j, cur, result, candidates, target - candidates[j]);
            cur.removeLast();
        }
    }
}
