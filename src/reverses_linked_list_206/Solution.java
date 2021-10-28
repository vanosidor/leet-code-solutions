package reverses_linked_list_206;

import common.StdOut;

class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode newHead = null;
//        while (head != null) {
//            ListNode next = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = next;
//        }
//
//        return newHead;
//    }

    public ListNode reverseList(ListNode head) {
        // recursive reverse list
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        Main.display(head);
        StdOut.println();
        Main.display(newHead);
        StdOut.println();

        return newHead;
    }
}
