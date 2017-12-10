package problemsolving.ibit;

import problemsolving.algo.TreeNode;

import java.util.ArrayList;

/**
 * Created by ariko on 12/6/2017.
 */
public class RootLeafPathsWithSum {

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> solve(TreeNode a, int sum) {
        if (a == null) return res;
        solveUtil(a, sum, new ArrayList<>(), 0);
        return res;
    }

    private void solveUtil(TreeNode a, int sum, ArrayList<Integer> currPath, int currSum) {
        if(a==null) return;
        currPath.add(a.val);

        if (a.left == null && a.right == null && (a.val + currSum) == sum) {
                res.add(currPath);
        } else {
            ArrayList<Integer> pathLeft = new ArrayList<>();
            ArrayList<Integer> pathRight = new ArrayList<>();
            pathLeft.addAll(currPath);
            pathRight.addAll(currPath);
            solveUtil(a.left, sum, pathLeft, currSum + a.val);
            solveUtil(a.right, sum, pathRight, currSum + a.val);
        }


    }

}
