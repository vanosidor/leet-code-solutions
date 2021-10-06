package search_insert_position_35;

import common.In;
import common.StdOut;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");

        String fileName = args[0];

        In in = new In("src/" + search_insert_position_35.Main.class.getPackage().getName() + "/" + fileName);

        int target = in.readInt();
        int n = in.readInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.readInt();
        }

        Solution solution = new Solution();
        StdOut.println(solution.searchInsert(nums, target));
    }
}
