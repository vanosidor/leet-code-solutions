package is_valid_BST_98;

// Нужно обратить внимания на такой кейс что любые узлы в провом поддереве должны быть больше (в левом - меньше), а не только дочерние.
//Нужно передавать min и max
//[5,4,6,null,null,3,7]

public class Solution {

    //    TODO make correct solution
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        /* False if left is > than node */
        if (root.left != null && root.left.val > root.val)
            return false;

        /* False if right is < than node */
        if (root.right != null && root.right.val < root.val)
            return false;

        /* False if, recursively, the left or right is not a BST */
        if (!isValidBST(root.left) || !isValidBST(root.right))
            return false;

        /* Passing all that, it's a BST */
        return true;
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
