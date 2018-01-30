package problemsolving.crackingTheCode;

import org.junit.Test;
import problemsolving.algo.TreeNode;
import problemsolving.worker.TreePrint;

public class SortedArrToBinTree {


    @Test
    public void t() {
        int[] arr = {1, 2, 3, 4, 5};
        solve(arr);
    }

    private TreeNode solve(int[] arr) {
        return util(arr, 0, arr.length);
    }

    private TreeNode util(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(mid);
        node.left = util(arr, start, mid - 1);
        node.right = util(arr, mid + 1, end);
        return node;
    }


}
