package com.zadziarnouski.leetcode;

// TC: O(n), SC: O(1)
class LongestRepeatingCharacterReplacement {

    static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            if (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
