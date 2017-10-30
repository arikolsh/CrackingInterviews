package problemsolving.algo;

import org.junit.Test;

public class ListNodeTest {
    @Test
    public void test() {
        ListNode lst = new ListNode(5);
        lst.next=new ListNode(7);
        lst.next.next=new ListNode(9);
        ListNode a = ListNode.reverse(lst);
        a.print();
        System.out.println(a.next.next==lst);
    }

    @Test
    public void testMerge() {
        ListNode lst1 = new ListNode(1);
        lst1.next=new ListNode(4);
        lst1.next.next=new ListNode(20);
        ListNode lst2 = new ListNode(3);
        lst2.next=new ListNode(4);
        lst2.next.next=new ListNode(32);
        lst2.next.next.next=new ListNode(35);
        ListNode res = ListNode.recursiveMerge(lst1,lst2);
        res.print();

    }

    @Test
    public void testSeperation() {
        ListNode lst1 = new ListNode(1);
        lst1.next=new ListNode(4);
        lst1.next.next=new ListNode(20);
        lst1.next.next.next=new ListNode(22);
        ListNode res[] = ListNode.seperate(lst1,4);
        res[0].print();
        System.out.println();
        res[1].print();


    }
}
