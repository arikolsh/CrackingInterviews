package problemsolving.algo;

import org.w3c.dom.NodeList;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode reverse(ListNode head) {
        // if head is null or only one node, it's reverse of itself.
        if ((head == null) || (head.next == null)) return head;

        // reverse the sub-list leaving the head node.
        ListNode reverse = reverse(head.next);

        // head.next still points to the last element of reversed sub-list.
        // so move the head to end.
        head.next.next = head;

        // point last node to nil, (get rid of cycles)
        head.next = null;
        return reverse;
    }

    public ListNode reverseIterative(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        this.val = node.val;
        this.next = node.next;
        return node;
    }

    public void print() {
        ListNode curr = this;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static ListNode recursiveMerge(ListNode a, ListNode b) {
        ListNode res;
        if (a == null) return b;
        else if (b == null) return a;
        if (a.val <= b.val) {
            res = a;
            res.next = recursiveMerge(a.next, b);
        } else {
            res = b;
            res.next = recursiveMerge(a, b.next);
        }
        return res;
    }

    public static ListNode[] seperate(ListNode a, int n) {
        //assume n is the size
        ListNode left, right, curr;
        curr = a;
        for (int i = 1; i < n / 2; i++) {
            curr = curr.next;
        }
        right = curr.next;
        curr.next = null;
        left = a;
        ListNode[] res = {left, right};
        return res;
    }


}
