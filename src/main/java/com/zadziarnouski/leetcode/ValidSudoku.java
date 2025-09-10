package com.zadziarnouski.leetcode;

import java.util.HashSet;
import java.util.Set;

// TC: O(1), SC: O(1)
class ValidSudoku {

    @SuppressWarnings("unchecked")
    static boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = (Set<Character>[]) new HashSet[9];
        Set<Character>[] cols = (Set<Character>[]) new HashSet[9];
        Set<Character>[] boxes = (Set<Character>[]) new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                char digit = board[i][j];
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (rows[i].contains(digit) || cols[j].contains(digit) || boxes[boxIndex].contains(digit)) {
                    return false;
                }

                rows[i].add(digit);
                cols[j].add(digit);
                boxes[boxIndex].add(digit);
            }

        }
        return true;
    }
}
