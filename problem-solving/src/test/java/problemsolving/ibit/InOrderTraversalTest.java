package problemsolving.ibit;

import org.junit.Test;
import problemsolving.algo.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ariko on 12/3/2017.
 */
public class InOrderTraversalTest {

    @Test
    public void solve( ){

        TreeNode t = new TreeNode(4);
        t.right = new TreeNode(5);
        t.right.right = new TreeNode(10);
        t.right.right.right = new TreeNode(12);
        t.right.right.left = new TreeNode(7);
        t.left = new TreeNode(3);
        t.left.left = new TreeNode(1);
        ArrayList<Integer> res = new InOrderTraversal().solve(t);
        System.out.println(res);


    }

}
