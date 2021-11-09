package maximum_subarray_53;

import common.In;
import common.StdOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int[] nums = in.readAllInts();

        Solution solution = new Solution();
        StdOut.print(solution.maxSubArray(nums));
    }

}
