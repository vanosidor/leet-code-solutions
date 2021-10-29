package is_valid_BST_98;

import common.In;
import common.TreeNode;

public class Main {
    public static void main(String[] args) {

        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");

        String fileName = args[0];
        In in = new In("src/" + Main.class.getPackage().getName() + "/" + fileName);

        int[] nums = in.readAllInts();

        Solution solution = new Solution();

        TreeNode root = TreeNode.createFromArray(nums);
        TreeNode.print2D(root);
        System.out.print(solution.isValidBST(root));
    }
}
