package problemsolving.worker;

import org.junit.Test;

public class BinTreePrintTest {
    @Test
    public void printTest(){
        BinaryTree b = new BinaryTree(5);
        b.left= new BinaryTree(4);
        b.left.left= new BinaryTree(2);
        b.left.right = new BinaryTree(3);
        b.right = new BinaryTree(20);
        b.right.right=new BinaryTree(30);
        b.right.right.right=new BinaryTree(45);
        new BinTreePrint().print(b);
    }


}
