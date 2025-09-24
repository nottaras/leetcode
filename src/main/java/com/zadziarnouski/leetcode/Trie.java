package com.zadziarnouski.leetcode;

import java.util.HashMap;

// TC: O(m), SC: O(m * σ),
// m - length of the word being inserted/searched
// σ - size of the alphabet (e.g. 52 for a-zA-Z)
class Trie {
    TrieNode root;

    static class TrieNode {
        HashMap<Character, TrieNode> children;
        boolean word = false;

        TrieNode() {
            children = new HashMap<>();
        }
    }

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            curr.children.computeIfAbsent(c, k -> new TrieNode());
            curr = curr.children.get(c);
        }

        curr.word = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            if (curr.children.get(c) == null) {
                return false;
            }

            curr = curr.children.get(c);
        }

        return curr.word;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for (char c : prefix.toCharArray()) {
            if (curr.children.get(c) == null) {
                return false;
            }

            curr = curr.children.get(c);
        }

        return true;
    }
}
