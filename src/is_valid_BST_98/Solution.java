package is_valid_BST_98;

import common.TreeNode;

public class Solution {
    // Нужно обратить внимания на такой кейс что любые узлы в провом поддереве должны быть больше (в левом - меньше), а не только дочерние.
    //Нужно передавать min и max
    // [2, 1, 3] => true
    // [5,4,6,null,null,3,7] => false
    // [Integer.MIN_VALUE, Integer.MIN_VALUE] => false

    public boolean isValidBST(TreeNode root) {
        return isValidUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidUtil(TreeNode root, long min, long max) {
        if (root == null)
            return true;

        if (root.val <= min || root.val >= max) return false;

        return isValidUtil(root.left, min, root.val) && isValidUtil(root.right, root.val, max);
    }

//     Intuitive but wrong solution
//     public boolean isValidBST(TreeNode root) {
//        if (root == null)
//            return true;
//
//        /* False if left is > than node */
//        if (root.left != null && root.left.val > root.val)
//            return false;
//
//        /* False if right is < than node */
//        if (root.right != null && root.right.val < root.val)
//            return false;
//
//        /* False if, recursively, the left or right is not a BST */
//        if (!isValidBST(root.left) || !isValidBST(root.right))
//            return false;
//
//        /* Passing all that, it's a BST */
//        return true;
//    }
}

