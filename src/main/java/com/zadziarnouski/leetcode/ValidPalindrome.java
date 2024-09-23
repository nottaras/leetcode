package com.zadziarnouski.leetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String onlyLetters = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversedLetters = new StringBuilder(onlyLetters).reverse().toString();

        return onlyLetters.equals(reversedLetters);
    }
}
