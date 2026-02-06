package com.zadziarnouski.leetcode;

//TC: O(n), SC: O(1)
class ReverseString {

    static void reverseString(char[] s) {
        for (int l = 0, r = s.length - 1; l < r; l++, r--) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
        }
    }
}
