package problemsolving.algo;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testIntersection(){

        ListNode intersection= new ListNode(20);

        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(4);
        l1.next.next=intersection; //intersection
        l1.next.next.next = new ListNode(100);
        l1.print();
        System.out.println();

        ListNode l2 = new ListNode(7);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(15);
        l2.next.next.next = intersection;
        l2.print();

        ListNode res = ListNode.findIntersection(l1,l2);
        assertTrue(intersection==res);
        System.out.println();
        res.print();

        ListNode res2 = ListNode.findIntersectionV2(l1,l2);
        assertTrue(intersection==res2);
        System.out.println();
        res2.print(); //Objects that are equal must have the same hash code within a running process
        //As much as is reasonably practical, the hashCode method defined by class Object does
        // return distinct integers for distinct objects.
    }
}
