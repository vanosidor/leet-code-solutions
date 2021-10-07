package reversed_linked_list_92;

import common.In;

public class Main {

    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");

        String fileName = args[0];
        In in = new In("src/" + Main.class.getPackage().getName() + "/" + fileName);

        int left = Integer.parseInt(in.readLine());
        int right = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.readInt();
        }

        // create node
        ListNode root = null;
        for (int i = n - 1; i >= 0; i--) {
            root = new ListNode(nums[i], root);
        }

        display(root);
        System.out.println();

        Solution solution = new Solution();
        display(solution.reverseBetween(root, left, right));
    }

    static void display(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}
