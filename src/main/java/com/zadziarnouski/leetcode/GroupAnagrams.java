package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {

    static List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
