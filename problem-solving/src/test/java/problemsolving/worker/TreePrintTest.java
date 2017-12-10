package problemsolving.worker;

import org.junit.Test;
import problemsolving.algo.Graph;

/**
 * Created by ariko on 12/2/2017.
 */
public class TreePrintTest {

    @Test
    public void t() {

        Graph  g = new Graph(8,true);
        g.add(1,3);
        g.add(1,4);
        g.add(1,5);
        g.add(5,8);
        g.add(3,6);
        g.add(3,7);
        g.add(8,2);
        new TreePrint().solve(g,1);
        
    }
}
