package com.zadziarnouski.leetcode;

import com.zadziarnouski.leetcode.support.VersionControl;

//TC: O(log n), SC:O(1)
class FirstBadVersion extends VersionControl {

    public FirstBadVersion(int firstBad) {
        super(firstBad);
    }

    int firstBadVersion(int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
