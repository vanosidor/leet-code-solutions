package move_zeroes_283;

import common.In;
import common.StdOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In(new File("src/" +  Main.class.getPackage().getName() + "/" + fileName));

        int[] nums = in.readAllInts();

        for (int num : nums) {
            StdOut.print(num);
        }

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        StdOut.println("\nresult:");
        for (int num : nums) {
            StdOut.print(num);
        }
    }
}
