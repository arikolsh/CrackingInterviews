package problemsolving.binarytrees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.junit.Test;

public class BinarySearchTree {

    @Getter
    private int size;
    public BinTreeNode root;

    public BinarySearchTree() {
        size = 0;
        root = new BinTreeNode(Integer.MIN_VALUE, "DUMMY");
    }

    public BinTreeNode getRoot() {
        if (size == 0) return null;
        return root.right;
    }

    public void add(int key, String data) {
        BinTreeNode curr = root;
        BinTreeNode newNode = new BinTreeNode(key, data);
        while (!isLeaf(curr)) {
            if (curr.key > key) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (curr.key > key) {
            curr.left = newNode;
        } else {
            curr.right = newNode;
        }
        size++;
    }

    public void remove(int key) {
        if (size == 0) return;
        BinTreeNode curr = root.right;
        BinTreeNode parent = root;
        while (curr.key != key) {
            parent = curr;
            if (curr.key > key) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        boolean isLeftChild = parent.left.equals(curr);
        if (isLeaf(curr)) {
            if (isLeftChild) parent.left = null;
            else parent.right = null;
        } else {
            if (isLeftChild) {
                if(curr.left==null){
                    parent.left=curr.left;
                }else{
                    //[key,data] = //find and remove successor
                    //put [key,data] instead of curr
                }
            } else {
                if (curr.right == null) {
                    parent.right = curr.left;
                }else{
                    //[key,data] = //find and remove successor
                    //put [key,data] instead of curr
                }
            }
        }

    }

    private boolean isLeaf(BinTreeNode node) {
        return node.left == null && node.right == null;
    }

    @Test
    public void t() {
        BinTreeNode node = new BinTreeNode(5);
    }

    @Data
    class BinTreeNode {
        int key;
        String data;
        BinTreeNode left;
        BinTreeNode right;

        BinTreeNode(int key) {
            this(key, "NO DATA");
        }

        BinTreeNode(int key, String data) {
            this.key = key;
            this.data = data;
        }
    }
}
