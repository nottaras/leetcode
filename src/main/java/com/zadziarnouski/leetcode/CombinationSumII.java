package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TC: O(C(n, k) * k), SC: O(k)
class CombinationSumII {

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }

            cur.add(candidates[j]);
            dfs(j + 1, cur, result, candidates, target - candidates[j]);
            cur.removeLast();
        }
    }
}
