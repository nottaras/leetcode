package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

// TC: O(n), SC: O(n)
class EvaluateReversePolishNotation {

    static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    int right = stack.pop();
                    int left = stack.pop();
                    stack.push(left - right);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int right = stack.pop();
                    int left = stack.pop();
                    stack.push(left / right);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
