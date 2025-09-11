package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

// TC: O(1), SC: O(n)
class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        }

        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new NoSuchElementException();
        }

        return minStack.peek();
    }
}
