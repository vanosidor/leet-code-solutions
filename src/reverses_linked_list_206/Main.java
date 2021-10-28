package reverses_linked_list_206;

import common.In;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");

        String fileName = args[0];
        In in = new In("src/" + Main.class.getPackage().getName() + "/" + fileName);

        int n = Integer.parseInt(in.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.readInt();
        }

        ListNode root = null;
        for (int i = n - 1; i >= 0; i--) {
            root = new ListNode(nums[i], root);
        }

        Solution solution = new Solution();

        display( solution.reverseList(root));
    }

    static void display(ListNode root) {
        ListNode newRoot = root;
        while (newRoot != null) {
            System.out.print(newRoot.val + " ");
            newRoot = newRoot.next;
        }
    }
}


