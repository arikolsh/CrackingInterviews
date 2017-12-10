package problemsolving.ibit;

import java.util.ArrayList;
import java.util.HashMap;

public class MinJumps {

    HashMap<String, Integer> dict = new HashMap<>();

     public int solve(ArrayList<Integer> arr) {
        int a = solveUtil(arr, 0, 0);
        if (a < Integer.MAX_VALUE) return a;
        else return -1; //cannot
    }

    private int solveUtil(ArrayList<Integer> arr, int start, int total) {
        if (total >= arr.size()) return Integer.MAX_VALUE;
        if (start >= arr.size()) return Integer.MAX_VALUE;
        if (start == arr.size() - 1) return total;
        String k = String.format("%s,%s", start, total);
        int minJumps = Integer.MAX_VALUE;
        if (!dict.containsKey(k)) {
            int jumps = arr.get(start);
            while (jumps > 0) {
                minJumps = Math.min(minJumps, solveUtil(arr, start + jumps, total + 1));
                jumps--;
            }
            dict.put(k, minJumps);
        }

        return dict.get(k);
    }

}
