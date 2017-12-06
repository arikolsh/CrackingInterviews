package problemsolving.ibit;

import problemsolving.algo.TreeNode;

/**
 * Created by ariko on 12/6/2017.
 */
public class MaximumTreeDepth {

    public int solve(TreeNode a) {

        if (a == null) return 0;
        return 1 + Math.max(solve(a.left), solve(a.right));

    }

}
