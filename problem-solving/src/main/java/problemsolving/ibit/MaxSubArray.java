package problemsolving.ibit;

import java.util.ArrayList;

/**
 * Created by ariko on 10/20/2017.
 */
public class MaxSubArray { //working solution
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> nonNegativeIntervals = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> currSubArr = new ArrayList<Integer>();
        ArrayList<Integer> maxSubArr = new ArrayList<Integer>();
        ;
        for (int i = 0; i < a.size(); i++) {
            Integer num = a.get(i);
            if (num >= 0) {
                currSubArr.add(num);
                if (i == a.size() - 1) {
                    nonNegativeIntervals.add(new ArrayList<>(currSubArr));
                }
            } else {
                nonNegativeIntervals.add(new ArrayList<>(currSubArr));
                currSubArr = new ArrayList<>();

            }
        }
        long maxSum = Long.MIN_VALUE; long tmpSum;
        for (ArrayList<Integer> interval : nonNegativeIntervals) {
            if (interval.size() == 0) continue;
            tmpSum = interval.stream().mapToLong(x->x.longValue()).sum();
            if (tmpSum > maxSum) {
                maxSubArr = interval;
                maxSum = tmpSum;
            }
        }
        return maxSubArr;
    }


}





