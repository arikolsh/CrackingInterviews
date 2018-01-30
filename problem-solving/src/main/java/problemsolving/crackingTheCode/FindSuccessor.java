package problemsolving.crackingTheCode;

import org.junit.Test;
import problemsolving.algo.TreeNode;

public class FindSuccessor {

    @Test
    public void t() {

        TreeNodeV2 root = new TreeNodeV2(20, null);
        root.right = new TreeNodeV2(50, root);
        root.left = new TreeNodeV2(3, root);
        root.left.left = new TreeNodeV2(1, root.left);
        TreeNodeV2 tree1 = new TreeNodeV2(4, root.left);
        tree1.right = new TreeNodeV2(7, tree1);
        tree1.right.left = new TreeNodeV2(6, tree1.right);
        tree1.left = new TreeNodeV2(3, tree1);
        root.left.right = tree1;

        System.out.println(solve(tree1).val);
        System.out.println(solve(tree1.right).val);


    }

    private TreeNodeV2 solve(TreeNodeV2 root) {
        TreeNodeV2 curr;
        curr = root;
        if (root.right == null) {
            //go up
            while (curr != null) {
                if (curr.val > root.val) return curr;
                curr = curr.parent;
            }
            return null;
        }
        curr = curr.right;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

}

class TreeNodeV2 {

    public int val;
    public TreeNodeV2 left;
    public TreeNodeV2 right;
    public TreeNodeV2 parent;

    public TreeNodeV2(int x, TreeNodeV2 parent) {
        val = x;
        this.parent = parent;
    }
}

