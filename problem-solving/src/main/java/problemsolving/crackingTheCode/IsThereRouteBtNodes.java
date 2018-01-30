package problemsolving.crackingTheCode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.Test;
import problemsolving.algo.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.stream.Stream;

public class IsThereRouteBtNodes {

    public boolean solve(Graph g, int s, int t) {

        Queue<PathNode> queue = new LinkedList<>();
        boolean[] visited = new boolean[g.getV().length];
        queue.add(new PathNode(s, null));
        visited[s] = true;
        while (!queue.isEmpty()) {
            PathNode curr = queue.poll();
            for (Integer adj : g.getAdj(curr.getVal())) {
                if (!visited[adj]) {
                    PathNode pn = new PathNode(adj, curr);
                    queue.add(pn);
                    visited[adj] = true;
                    if (adj.equals(t)) {
                        printPath(pn);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void printPath(PathNode pn) {
        StringBuilder s = new StringBuilder();
        while (pn != null) {
            s.insert(0, pn.val + "->");
            pn = pn.getParent();
        }
        System.out.println(s.delete(s.length() - 2, s.length()));
    }

    @Test
    public void t() {
        Graph g = new Graph(5, true);
        g.add(1, 2);
        g.add(3, 2);
        g.add(3, 5);
        g.add(2, 4);
        g.add(4, 5);
        System.out.println(solve(g, 1, 5));
    }

    @Getter
    @AllArgsConstructor
    class PathNode {
        private int val;
        private PathNode parent;
    }
}


