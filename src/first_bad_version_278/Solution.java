package first_bad_version_278;

import common.StdOut;

public class Solution extends VersionControl {

    /* input 1
    5
    4
    */

    public Solution(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left ) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
            StdOut.println("left = " + left + ",right = " + right);
        }

        return left;
    }
}
