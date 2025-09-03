package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

// TC: O(n), SC: O(n)
class ValidParentheses {

    static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(')
                    || (c == '}' && top != '{')
                    || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
