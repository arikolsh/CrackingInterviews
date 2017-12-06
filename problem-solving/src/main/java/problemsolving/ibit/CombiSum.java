package problemsolving.ibit;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ariko on 12/6/2017.
 */
public class CombiSum {

    Map<String, ArrayList<Integer>> res = new HashMap<>();

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<Integer> newLst = new ArrayList<>();
        newLst.addAll(a);
        Collections.sort(newLst);
        utill(newLst, b, new ArrayList<>(), 0, 0);
        ArrayList<ArrayList<Integer>> finalRes = new ArrayList<>();
        res.forEach((k, v) -> finalRes.add(v));
        return finalRes;

    }

    public void utill(ArrayList<Integer> a, int sum, ArrayList<Integer> currCombi, int i, int currSum) {
        if (res.containsKey(currCombi.toString())) return;
        if (currSum == sum) {
            res.put(currCombi.toString(), currCombi); //O(n)
        }
        if (i >= a.size() || currSum > sum) {
            return;
        }
        ArrayList<Integer> with = new ArrayList<>();
        ArrayList<Integer> without = new ArrayList<>();
        with.addAll(currCombi);
        without.addAll(currCombi);
        with.add(a.get(i));
        utill(a, sum, with, i + 1, currSum + a.get(i));//take a(i)
        utill(a, sum, without, i + 1, currSum);//dont take a(i)
    }


}
