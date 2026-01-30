package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

// TC: O(n), SC: O(n)
class BaseballGame {

    static int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String str : operations) {
            switch (str) {
                case "+" -> {
                    Integer b = stack.pop();
                    Integer a = stack.pop();
                    stack.push(a);
                    stack.push(b);
                    stack.push(a + b);
                }
                case "D" -> stack.push(stack.peek() * 2);
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(str));
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.poll();
        }

        return result;
    }
}
