package problemsolving.ibit;

import org.junit.Test;

import java.util.*;

public class PrintVerticalTree {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> nodesByDistanceMap = new HashMap<>();
        TreeNode root = A;
        calcDistances(root, nodesByDistanceMap, 0);
        List<Integer> distances = new ArrayList<>(nodesByDistanceMap.keySet());
        Collections.sort(distances);
        for (Integer dist : distances) {
            ArrayList<Integer> tmp = new ArrayList<>(nodesByDistanceMap.get(dist));
            res.add(tmp);
        }
        return res;
    }

    public void calcDistances(TreeNode root, Map<Integer, List<Integer>> nodesByDistanceMap, Integer currDistance) {
        if (root == null) return;
        calcDistances(root.left, nodesByDistanceMap, currDistance - 1); //go left
        if (!nodesByDistanceMap.containsKey(currDistance)) {
            nodesByDistanceMap.put(currDistance, new ArrayList<>());
        }
        nodesByDistanceMap.get(currDistance).add(root.val);
        calcDistances(root.right, nodesByDistanceMap, currDistance + 1); //go right
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    @Test
    public void t() {

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(9);
        System.out.println(verticalOrderTraversal(root));

    }
}
