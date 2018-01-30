package problemsolving.crackingTheCode;

import lombok.ToString;
import org.junit.Test;

public class LinkedListProblems {

    public int solveNthNodeFromLast(Node node, int n) {
        int[] res = {-1};
        int[] narr = {n};
        util(node, res, narr);
        return res[0];
    }

    public int solveNthNodeFromLastv2(Node node, int n) {
        int count = 0;
        for (Node curr = node; curr != null; curr = curr.next, count++) ;
        if (count < n) return -1;
        Node curr = node;
        for (int i = 0; i < count - n - 1 && curr != null; i++, curr = curr.next) ;
        return curr.val;
    }

    public void util(Node node, int[] res, int[] n) {
        if (node == null) return;
        util(node.next, res, n);
        if (0 == n[0]--) res[0] = node.val;
    }

    @Test
    public void t1() {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        System.out.println(solveNthNodeFromLastv2(node, 2));

    }

    @Test
    public void t2() {

        Node node = new Node(1);
        node.next = new Node(2);
        Node mid = new Node(3);
        node.next.next = mid;
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        System.out.println(node);
        removeNodeFromLst(mid);
        System.out.println(node);
    }

    @Test
    public void t3() {

        Node a = new Node(3);
        a.next = new Node(1);
        a.next.next = new Node(5);
        Node b = new Node(5);
        b.next = new Node(9);
        b.next.next = new Node(2);

        System.out.println(addTwoLists(a, b));

    }

    private void removeNodeFromLst(Node mid) {
        assert mid != null;
        Node curr = mid;
        Node prev = mid;
        while (curr.next != null) {
            prev = curr;
            curr.val = curr.next.val;
            curr = curr.next;
        }
        prev.next = null;
    }

    private Node addTwoLists(Node a, Node b) {

        Node aCurr = a;
        Node bCurr = b;
        int carry = 0;
        int sum = 0;
        Node res = null;
        Node resRoot = null;
        while (aCurr != null && bCurr != null) {

            sum = aCurr.val + bCurr.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            if (res == null) {
                res = new Node(sum);
                resRoot = res;
            } else {
                res.next = new Node(sum);
                res = res.next;
            }

            aCurr = aCurr.next;
            bCurr = bCurr.next;
        }

        addRest(res, aCurr != null ? aCurr : bCurr, carry);

        if (carry != 0) {
            res.next = new Node(carry);
        }

        return resRoot;
    }

    private void addRest(Node res, Node rest, int carry) {
        int sum = 0;
        Node r = res;
        while (rest != null) {
            sum = rest.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            if (r == null) res = new Node(sum);
            else {
                res.next = new Node(sum);
                res = res.next;
            }
            rest = rest.next;

        }
    }

}

@ToString
class Node {

    Node next;
    int val;

    Node(int v) {
        val = v;
    }

}