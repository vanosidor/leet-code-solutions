package four_sum_18;

import common.In;
import common.StdOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int target = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.readInt();
        }

        Solution solution = new Solution();
        StdOut.print(solution.fourSum(nums, target));
    }
}
