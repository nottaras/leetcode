package com.zadziarnouski.leetcode;

//TC: O(n + m), SC: O(1)
class RansomNote {

    boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() == 1 && magazine.length() == 1 && ransomNote.equals(magazine)) {
            return true;
        }

        int[] counts = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            counts[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            counts[ransomNote.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count < 0) {
                return false;
            }
        }

        return true;
    }
}
