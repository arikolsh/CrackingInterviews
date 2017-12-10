package problemsolving.ibit;

import problemsolving.algo.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ariko on 12/3/2017.
 */
public class InOrderTraversal {

    public ArrayList<Integer> solve(TreeNode a ){

        TreeNode curr = a;
        ArrayList<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(true){
            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            if(s.isEmpty()){
                break;
            }
            curr = s.pop();
            inorder.add(curr.val);
            curr = curr.right;
        }
        return inorder;


    }

}
