package com.zadziarnouski.leetcode;

// TC: O(n^2), SC: O(1)
class PalindromicSubstrings {

    static int countSubstrings(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += expand(s, i, i);
            result += expand(s, i, i + 1);
        }

        return result;
    }

    static int expand(String s, int l, int r) {
        int count = 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }

        return count;
    }
}
