package problemsolving.worker;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinTreePrint {

    public void print(BinaryTree t) {
        Queue<BinaryTree> currLevel = new LinkedList<>();
        Queue<BinaryTree> tmp= new LinkedList<>() ;
        currLevel.add(t);
        BinaryTree node ;
        while (true){
            while(!currLevel.isEmpty()) {
                node = currLevel.poll();
                System.out.print(node.value + " ");
                if (node.left != null) {
                    tmp.add(node.left);
                }
                if (node.right != null) {
                    tmp.add(node.right);
                }
            }
            if(tmp.isEmpty()){
                break;
            }
            currLevel.addAll(tmp);
            tmp.clear();
            System.out.println();
        }
    }


}

class BinaryTree {
    BinaryTree left;
    BinaryTree right;
    int value;

    public BinaryTree(int i) {
        value = i;
    }
}
