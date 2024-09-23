package com.zadziarnouski.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

    public static boolean isAnagram(String original, String anagramCandidate) {
        if (original.length() != anagramCandidate.length()) {
            return false;
        }

        List<String> chars = new ArrayList<>(Arrays.asList(original.split("")));

        for (int i = 0; i < anagramCandidate.length(); i++) {
            chars.remove(Character.toString(anagramCandidate.charAt(i)));
        }

        return chars.isEmpty();
    }
}
