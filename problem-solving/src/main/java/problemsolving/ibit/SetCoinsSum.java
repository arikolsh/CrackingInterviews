package problemsolving.ibit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ariko on 12/8/2017.
 */
public class SetCoinsSum {

    public static int methodCount = 0;

    private HashMap<String, Integer> s = new HashMap<>();


    public int coinchange2(ArrayList<Integer> a, int b) {


        return util(a, 0, 0, b);


    }

    //35 without memoization
    private int util(ArrayList<Integer> a, int i, int currSum, int b) {
        methodCount++;
        if (currSum == b) return 1;
        if (i >= a.size() || currSum > b) return 0;
        if (s.containsKey(getKey(i, currSum))) return s.get(getKey(i, currSum));
        else {
            int res = util(a, i, currSum + a.get(i), b) + util(a, i + 1, currSum, b);
            s.put(getKey(i, currSum), res);
            return res;
        }
    }

    private String getKey(int i, int currSum) {
        return String.format("%d%d", i, currSum);
    }


}
