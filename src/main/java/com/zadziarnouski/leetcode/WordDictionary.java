package com.zadziarnouski.leetcode;

class WordDictionary {
    TrieNode root;

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }

    public WordDictionary() {
        root = new TrieNode();
    }

    // TC: O(n), SC: O(n)
    public void addWord(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (curr.children[i] == null) {
                curr.children[i] = new TrieNode();
            }

            curr = curr.children[i];
        }

        curr.isWord = true;
    }

    // TC: O(26^d), SC: O(n)
    // d - number of .(wildcards)
    public boolean search(String word) {
        return searchRecursive(word.toCharArray(), 0, root);
    }

    private boolean searchRecursive(char[] word, int index, TrieNode node) {
        if (index == word.length) {
            return node.isWord;
        }

        char c = word[index];

        if (c == '.') {
            for (TrieNode child : node.children) {
                if (child != null && searchRecursive(word, index + 1, child)) {
                    return true;
                }
            }

            return false;
        } else {
            TrieNode next = node.children[c - 'a'];

            return next != null && searchRecursive(word, index + 1, next);
        }
    }
}
