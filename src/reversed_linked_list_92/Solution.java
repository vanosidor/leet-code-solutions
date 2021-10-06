package reversed_linked_list_92;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


// I) Iterative link reversal solution
//class Solution {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//
//        if (head == null) return null;
//
//        // initialization
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode p = dummy; // p - node before reversing
//
//        for (int i = 0; i < left - 1; i++) {
//            p = p.next;
//        }
//
//        ListNode tail = p.next; // tail node that be reversed
//        for (int i = 0; i < right - left; i++) {
//            ListNode tmp = p.next;
//            p.next = tail.next;
//            tail.next = tail.next.next;
//            p.next.next = tmp;
//        }
//
//        return dummy.next;
//    }
//}


// II) Recursive solution
class Solution {

    // Object level variables since we need the changes
    // to persist across recursive calls and Java is pass by value.
    private boolean stop;
    private ListNode left;

    public void recurseAndReverse(ListNode right, int m, int n) {

        // base case. Don't proceed any further
        if (n == 1) {
            return;
        }

        // Keep moving the right pointer one step forward until (n == 1)
        right = right.next;

        // Keep moving left pointer to the right until we reach the proper node
        // from where the reversal is to start.
        if (m > 1) {
            this.left = this.left.next;
        }

        // Recurse with m and n reduced.
        this.recurseAndReverse(right, m - 1, n - 1);

        // In case both the pointers cross each other or become equal, we
        // stop i.e. don't swap data any further. We are done reversing at this
        // point.
        if (this.left == right || right.next == this.left) {
            this.stop = true;
        }

        // Until the boolean stop is false, swap data between the two pointers
        if (!this.stop) {
            int t = this.left.val;
            this.left.val = right.val;
            right.val = t;

            // Move left one step to the right.
            // The right pointer moves one step back via backtracking.
            this.left = this.left.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        this.left = head;
        this.stop = false;
        this.recurseAndReverse(head, m, n);
        return head;
    }
}