package problemsolving.worker;

import problemsolving.algo.Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ariko on 12/2/2017.
 */
public class TreePrint {

    public void solve(Graph tree, Integer root) {

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tmp;
        System.out.println(root);
        queue.add(root);
        while (true) {
            tmp = new LinkedList<>();
            while (!queue.isEmpty()) { //in current
                Integer curr = queue.poll();
                for (Integer child : tree.getAdj(curr)) {
                    tmp.add(child);
                    System.out.print(child+ " ");
                }
            }
            System.out.println();
            if (tmp.isEmpty()) {
                return;
            }
            queue = tmp; //next level
        }
    }

}

