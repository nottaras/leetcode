package com.zadziarnouski.leetcode;

public class FreedomTrail {

    static int findRotateSteps(String ring, String key) {
        int count = 0;
        Ring ring1 = new Ring(ring);

        for (char c : key.toCharArray()) {
            count += ring1.findCloserLatter(c);
        }

        return count;
    }

    private static class Ring {
        int position = 0;
        int capacity;
        char[] letters;

        public Ring(String ring) {
            letters = ring.toCharArray();
            capacity = letters.length;
        }

        int findCloserLatter(char c) {
            int value = 0;

            String string = String.valueOf(letters);
            int index = string.indexOf(c);

            if (index == -1) {
                return 0;
            }
            if (index == position) {
                return 1;
            }

            int rotateLeft = rotateLeft(index);
            int rotateRight = rotateRight(index);

            position = index;
            if (rotateLeft < rotateRight) {
                value = rotateLeft + 1;
            } else if (rotateLeft > rotateRight) {
                value = rotateRight + 1;
            }

            return value;
        }

        private int rotateLeft(int index) {
            return index - position;
        }

        private int rotateRight(int index) {
            return position + (capacity - index);
        }
    }
}
