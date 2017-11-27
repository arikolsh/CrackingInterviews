package problemsolving.misc;

import java.util.*;

/**
 * Created by ariko on 11/27/2017.
 */
public class SortedArraysSumSet {

    public int solve(List<Integer> arr1, List<Integer> arr2, int i) {
        Set<Integer> res = new TreeSet<>();
        for (Integer a : arr1) {
            for (Integer b : arr2) {
                res.add(a + b);
            }
        }
        System.out.println(res);
        return i <= res.size() ? (new ArrayList<Integer>(res).get(i - 1)) : -1;
    }
}
