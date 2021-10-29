package common;


//  Definition for a binary tree node.
public class TreeNode {

    static final int COUNT = 10;

    public int val;
    public TreeNode left;
    public TreeNode right;

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

    public static TreeNode createFromArray(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Not able to create TreeNode. Array null or empty");

        return insertLevelOrder(null, arr, 0);
    }

    private static TreeNode insertLevelOrder(TreeNode root, int[] arr, int i) {
//        if (root == null) root = new TreeNode(arr[i]);

        if (i < arr.length) {
            TreeNode newNode = new TreeNode(arr[i]);
            root = newNode;
            root.left = insertLevelOrder(newNode.left, arr, 2 * i + 1);
            root.right = insertLevelOrder(newNode.right, arr, 2 * i + 2);
        }

        return root;
    }


    public static void print2D(TreeNode root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

    static void print2DUtil(TreeNode root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }
}
