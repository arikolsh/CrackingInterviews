package problemsolving.misc;

import org.junit.Test;
import problemsolving.algo.TreeNode;

public class MergeBinTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = rec(t1, t2);
        return root;

    }

    public TreeNode rec(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        int val = 0;
        if (t1 != null) val += t1.val;
        if (t2 != null) val += t2.val;
        TreeNode newNode = new TreeNode(val);
        TreeNode t1left = (t1 == null) ? null : t1.left;
        TreeNode t1right = (t1 == null) ? null : t1.right;
        TreeNode t2left = (t2 == null) ? null : t2.left;
        TreeNode t2right = (t2 == null) ? null : t2.right;
        newNode.left = rec(t1left, t2left);
        newNode.right = rec(t1right, t2right);
        return newNode;
    }

    @Test
    public void t() {
        TreeNode r1 = new TreeNode(1);
        r1.right = new TreeNode(2);
        r1.left = new TreeNode(3);
        r1.left.left = new TreeNode(5);
        TreeNode r2 = new TreeNode(2);
        r2.left = new TreeNode(1);
        r2.left.right = new TreeNode(4);
        r2.right = new TreeNode(3);
        r2.right.right = new TreeNode(7);
        mergeTrees(r1, r2);
    }

}
