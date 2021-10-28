package maximum_depth_of_binary_tree_104;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth, rightDepth;

        if (root.left == null) leftDepth = 0;
        else leftDepth = maxDepth(root.left);

        if (root.right == null) rightDepth = 0;
        else rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}


//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
