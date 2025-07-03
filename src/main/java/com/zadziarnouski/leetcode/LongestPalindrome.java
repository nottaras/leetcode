package com.zadziarnouski.leetcode;

//TC: O(n), SC: O(1)
class LongestPalindrome {

    int longestPalindrome(String s) {
        int[] counts = new int[128];
        for (char c : s.toCharArray()) counts[c]++;

        int result = 0;
        boolean hasOdd = false;
        for (int count : counts) {
            result += count / 2 * 2;
            if (count % 2 == 1) hasOdd = true;
        }

        return hasOdd ? result + 1 : result;
    }
}
