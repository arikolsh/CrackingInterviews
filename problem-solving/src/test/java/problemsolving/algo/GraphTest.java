package problemsolving.algo;

import org.junit.Test;

import java.util.LinkedList;

public class GraphTest {

    @Test
    public void testDFS() {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.DFS(0);
        g.DFSIter(0);

    }

    @Test
    public void testFullCircle() {
        Graph g = new Graph(4);

        g.addEdge(1, 2);
        g.addEdge(2, 1);
        g.addEdge(2, 0);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 1);
        System.out.println(g.hasFullCircle());
    }

}
