package problemsolving.ibit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ariko on 12/6/2017.
 */
public class Subset {

    Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {

        Collections.sort(a);
        util(a, new ArrayList<>(), 0);
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        map.forEach((k, v) -> lst.add(v));
        Collections.sort(lst, (x, y) -> compare(x, y));
        return lst;

    }

    private int compare(ArrayList<Integer> x, ArrayList<Integer> y) {
        int i = 0, j = 0;
        while (i < x.size() && j < y.size()) {

            int c = Integer.compare(x.get(i), y.get(j));
            if (c != 0) return c;
            i++;
            j++;
        }
        if (i < x.size()) {
            return 1;
        }
        if (j < y.size()) {
            return -1;
        }
        return 0;
    }

    public void util(ArrayList<Integer> a, ArrayList<Integer> currSubset, int i) {
        if (!map.containsKey(currSubset.toString())) {
            map.put(currSubset.toString(), currSubset);
        }
        if (i >= a.size()) return;
        ArrayList<Integer> with = new ArrayList<Integer>();
        ArrayList<Integer> without = new ArrayList<Integer>();
        with.addAll(currSubset);
        with.add(a.get(i));
        without.addAll(currSubset);
        util(a, without, i + 1);
        util(a, with, i + 1);
    }

}
