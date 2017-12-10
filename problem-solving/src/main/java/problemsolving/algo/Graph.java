package problemsolving.algo;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    private int V;

    private LinkedList<Integer> adj[];

    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int u) {
        adj[v].add(u);
    }

    public void DFS(int v) {
        System.out.println();
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
        System.out.print("|");
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + "->");
        for (Integer child : adj[v]) {
            if (!visited[child]) {
                DFSUtil(child, visited);
            }
        }

    }

    public ArrayList<Integer> DFSIter(int v) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        //create a stack for DFS
        Stack<Integer> stack = new Stack<>();
        Integer curr;
        stack.push(v);
        while (!stack.isEmpty()) {
            //pop a vertex from stack
            curr = stack.pop();
            if (!visited[curr]) {
                res.add(curr);
                visited[curr] = true;
            }
            //get all adjacent vertices of popped
            //vertex
            for (Integer child : adj[curr]) {
                if (!visited[child]) {
                    stack.push(child);
                }
            }
        }
        System.out.println();
        res.forEach(x -> System.out.print(x + "->"));
        System.out.print("|");
        return res;
    }

    public Boolean hasFullCircle() { //dfs with a twist
        for (int v = 0; v < V; v++) {
            if (hasFullCircleUtil(v)) {
                DFSIter(v);
                return true;
            }
        }
        return false;
    }

    private boolean hasFullCircleUtil(int v) { //todo!!!

        boolean[] visited = new boolean[V];
        boolean[] inStack = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        //create a stack for DFS
        Stack<Integer> stack = new Stack<>();
        Integer curr;
        stack.push(v);
        inStack[v] = true;
        while (!stack.isEmpty()) {
            //pop a vertex from stack
            curr = stack.pop();
            inStack[curr] = false;
            if (!visited[curr]) {
                res.add(curr);
                visited[curr] = true;
            }
            //get all adjacent vertices of popped
            //vertex
            for (Integer child : adj[curr]) {
                if (!visited[child] && !inStack[child]) {
                    stack.push(child);
                    inStack[child] = true;
                    if (child.equals(v) && allTrueExcept(inStack, child)) return true;
                }
            }
        }
        return false;
    }


    private boolean allTrueExcept(boolean[] inStack, Integer e) {
        if (inStack[e] == true) return false;
        for (int i = 0; i < inStack.length; i++) {
            boolean b = inStack[i];
            if (!b) {
                if (e.equals(i)) continue;
                return false;
            }
        }
        return true;
    }


}
