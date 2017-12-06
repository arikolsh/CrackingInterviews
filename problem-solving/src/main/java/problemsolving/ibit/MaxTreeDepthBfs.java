package problemsolving.ibit;

import problemsolving.algo.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ariko on 12/6/2017.
 */
public class MaxTreeDepthBfs {

    public int solve(TreeNode root) {
        if (root == null) return 0;
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList<>();
        LinkedList<TreeNode> tmp = new LinkedList<>();
        int max = 1;
        q.add(curr);
        while (true) {
            while (!q.isEmpty()) {
                curr = q.poll();
                if (curr.left != null) {
                    tmp.add(curr.left);
                }
                if (curr.right != null) {
                    tmp.add(curr.right);
                }
            }
            if (tmp.isEmpty()) {
                break;
            }
            max++;
            q.addAll(tmp);
            tmp.clear();
        }
        return max;


    }

}
