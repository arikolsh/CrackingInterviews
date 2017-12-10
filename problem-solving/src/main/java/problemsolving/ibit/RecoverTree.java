package problemsolving.ibit;

import problemsolving.algo.TreeNode;

import java.util.ArrayList;

/**
 * Created by ariko on 12/3/2017.
 */
public class RecoverTree {

    public  ArrayList<Integer> solve(TreeNode a){
        ArrayList<Integer> res = new ArrayList<>();
        if(a == null) return res;
        ArrayList<Integer> inorder = new InOrderTraversal().solve(a);
        int maxIndex = -1;
        int minIndex = -1;
        for(int i=1;i<inorder.size();i++){
            if(inorder.get(i) < inorder.get(i-1)){
                maxIndex = i-1;
                minIndex = i;
            }
        }
        if(maxIndex == -1) return res;
        for(int i=minIndex; i<inorder.size();i++ ){
            if(inorder.get(minIndex) > inorder.get(i)){
                minIndex = i;
            }
        }
        res.add(inorder.get(minIndex));
        res.add(inorder.get(maxIndex));
        return res;
    }


}
