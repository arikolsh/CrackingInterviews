package problemsolving.misc;

import org.junit.Test;
import problemsolving.algo.TreeNode;

import java.util.Arrays;

public class SeriDes {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        rec(root, str);
        return str.toString();
    }

    public void rec(TreeNode root, StringBuilder strBuild) {
        if (root == null) {
            strBuild.append("x ");
            return;
        }
        strBuild.append(root.val + " ");
        rec(root.left, strBuild);
        rec(root.right, strBuild);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        TreeNode root;
        root = desRec(data.split(" "),new int[1]);
        return root;
    }

    public TreeNode desRec(String[] data, int[] i){
        if(i[0]>=data.length) return null;
        if(data[i[0]].equals("x")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(data[i[0]]));
        i[0]++;
        root.left = desRec(data,i);
        i[0]++;
        root.right = desRec(data,i);
        return root;
    }

    @Test
    public void t() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(30);
        root.right.left = new TreeNode(15);
        String serialize = serialize(root);
        System.out.println(Arrays.toString(serialize.split(" ")));
        Integer.valueOf("5");
        System.out.println(serialize);
        deserialize(serialize);
    }

}
