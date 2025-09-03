package com.zadziarnouski.leetcode;

import java.util.Stack;

// TC: O(1), SC: O(n)
class MyQueue {
    private final Stack<Integer> inStack;
    private final Stack<Integer> outStack;

    MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    void push(int x) {
        inStack.push(x);
    }

    int pop() {
        if (outStack.empty()) while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }

        return outStack.pop();
    }

    int peek() {
        if (outStack.empty()) while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }

        return outStack.peek();

    }

    boolean empty() {
        if (outStack.empty()) while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }

        return outStack.empty();
    }
}
