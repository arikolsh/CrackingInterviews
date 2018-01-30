package problemsolving.crackingTheCode;

import org.junit.Test;
import problemsolving.algo.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class isTreeBalanced {

    public boolean solve(TreeNode root) {
        Set<Integer> heights = new HashSet<>();
        util(root, 0, heights);
        return heights.size() == 1;
    }

    private void util(TreeNode root, int h, Set<Integer> heights) {
        if (root == null) return;
        if (root.left == null && root.right == null) { //reached leaf
            heights.add(h);
            return;
        }
        util(root.right, h + 1, heights);
        util(root.left, h + 1, heights);
    }

    @Test
    public void t() {

        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(solve(root));

    }

}
