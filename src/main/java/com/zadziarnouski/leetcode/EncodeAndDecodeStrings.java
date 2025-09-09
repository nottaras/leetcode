package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeStrings {

    // TC: O(n), SC: O(n)
    String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String s : strs) {
            builder.append(s.length()).append("#").append(s);
        }

        return builder.toString();
    }

    // TC: O(n), SC: O(n)
    List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int pointer = 0;

        while (pointer < str.length()) {
            int delim = str.indexOf('#', pointer);
            int size = Integer.parseInt(str.substring(pointer, delim));
            int start = delim + 1;
            list.add(str.substring(start, start + size));
            pointer = start + size;
        }

        return list;
    }
}
