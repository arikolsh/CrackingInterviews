package problemsolving.algo;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

/**
 * Created by ariko on 11/27/2017.
 */
@ToString
public class Graph {
    @Getter
    List<Integer>[] V;
    @Getter
    Set<Edge<Integer>> edges;
    @Getter
    boolean directed;

    public Graph(int vertices, boolean directed) {
        V = new ArrayList[vertices + 1];
        for (int i = 0; i < vertices + 1; i++) {
            V[i] = new ArrayList<>();
        }
        this.directed = directed;
        edges = new HashSet<>();
    }

    public List<Integer> getAdj(int u){
        return V[u];
    }

    public Graph add(int u, int v) {
        assert (u <= V.length && v <= V.length && u > 0 && v > 0);
        Edge<Integer> e1 = new Edge<>(u, v);
        if (!edges.contains(e1)) {
            edges.add(e1);
            V[u].add(v);
        }
        if (!directed) {
            this.add(v, u);
        }
        return this;
    }

    public Graph remove(int u, int v) {
        assert (u <= V.length && v <= V.length && u > 0 && v > 0);
        V[u].remove(V[u].indexOf(v));
        if (!directed) {
            this.remove(v, u);
        }
        return this;
    }

    public ArrayList<Integer> findRoute(Integer start, Integer end) {
        Map<Integer, Integer> parentMap = findDFS(start);
        ArrayList<Integer> route = new ArrayList<>();
        route.add(end);
        Integer curr = end;
        Integer parent;
        while (true) { //backtrack
            parent = parentMap.get(curr);
            if (parent == null) {
                return null;
            }
            route.add(parent);
            if (parent.equals(start)) {
                Collections.reverse(route);
                return route;
            }
            curr = parent;
        }
    }

    public Map<Integer, Integer> findDFS(Integer start) {
        Map<Integer, Integer> parentMap = new HashMap<>();
        findDFSUtil(start, new boolean[V.length], parentMap);
        return parentMap;
    }

    private void findDFSUtil(Integer start, boolean[] visited, Map<Integer, Integer> parentMap) {
        visited[start] = true;
        int j = 0;
        //System.out.println(start);
        for (Integer v : V[start]) { //for each adjacent v
            if (!visited[v]) {
                parentMap.put(v, start);
                findDFSUtil(v, visited, parentMap);
            }
        }
    }

}
