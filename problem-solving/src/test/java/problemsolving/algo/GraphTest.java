package problemsolving.algo;

import lombok.Getter;
import org.junit.Test;

import java.util.*;

/**
 * Created by ariko on 11/27/2017.
 */
public class GraphTest {
    @Test
    public void t(){
        LinkedList<Integer> l = new LinkedList<>();
        System.out.println(l.getLast());

    }

    @Test
    public void test(){
        Graph g = new Graph(5,true);
        g.add(1,2);
        g.add(2,3);
        g.add(3,2);
        g.add(3,1);
        g.add(1,4);
        g.add(2,5);
        System.out.println(g);
        Map<Integer, Integer> parentMap = g.findDFS(1);
        parentMap.forEach((k,v)-> System.out.println(v+"->"+k));
        ArrayList<Integer> route = g.findRoute(1, 5);
        System.out.println(route);

    }

}
