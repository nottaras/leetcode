package com.zadziarnouski.leetcode.support;

public class VersionControl {
    private final int firstBad;

    public VersionControl(int firstBad) {
        this.firstBad = firstBad;
    }

    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}
