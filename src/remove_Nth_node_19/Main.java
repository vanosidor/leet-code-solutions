package remove_Nth_node_19;

import common.In;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");

        String fileName = args[0];
        In in = new In("src/" + Main.class.getPackage().getName() + "/" + fileName);

        int n = Integer.parseInt(in.readLine());
        int length = Integer.parseInt(in.readLine());
        int[] nums = new int[5];

        for (int i = 0; i < length; i++) {
            nums[i] = in.readInt();
        }

        // create node
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }

        display(head);

        Solution solution = new Solution();
        solution.removeNthFromEnd(head, n);
        display(head);
    }

    static void display(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
    }
}


