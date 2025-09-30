package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.List;

// TC: O(C(n, k) * k), SC: O(k)
class Combinations {

    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(1, new ArrayList<>(), result, n, k);

        return result;
    }

    private static void dfs(int i, List<Integer> cur, List<List<Integer>> result, int n, int k) {
        if (cur.size() == k) {
            result.add(new ArrayList<>(cur));
            return;
        }
        if (i > n) {
            return;
        }

        for (int j = i; j < n + 1; j++) {
            cur.add(j);
            dfs(j + 1, cur, result, n, k);
            cur.removeLast();
        }
    }
}
