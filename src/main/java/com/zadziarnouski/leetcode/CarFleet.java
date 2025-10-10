package com.zadziarnouski.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;

// TC: O(n * log n), SC: O(n)
class CarFleet {

    static int carFleet(int target, int[] position, int[] speed) {
        Integer[] indices = new Integer[position.length];
        for (int i = 0; i < position.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> position[b] - position[a]);

        ArrayDeque<Double> stack = new ArrayDeque<>();

        for (Integer index : indices) {
            double time = (double) (target - position[index]) / speed[index];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
