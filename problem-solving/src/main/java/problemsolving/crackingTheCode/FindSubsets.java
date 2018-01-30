package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.ArrayList;

public class FindSubsets {

    public ArrayList<ArrayList<Integer>> solve(int[] arr) {

        return util(arr, 0);


    }

    private ArrayList<ArrayList<Integer>> util(int[] arr, int i) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (i >= arr.length) {
            res.add(new ArrayList<>());
            return res;
        }
        util(arr, i + 1).forEach(subset -> {
            res.add(subset);
            ArrayList<Integer> tmp = new ArrayList<>(subset);
            tmp.add(arr[i]);
            res.add(tmp);
        });
        return res;
    }

    @Test
    public void t() {
        int[] arr = {1, 2, 3};
        System.out.println(solve(arr));
        solvePrint(arr);
    }

    private void solvePrint(int[] arr) {

        utilPrint(arr, new ArrayList<>(), 0);

    }

    private void utilPrint(int[] arr, ArrayList<Integer> subset, int i) {

        if (i >= arr.length) {
            System.out.println(subset);
            return;
        }
        //construct the subset
        utilPrint(arr, new ArrayList<>(subset), i + 1); //don't take the current
        subset.add(arr[i]);
        utilPrint(arr, subset, i + 1); //take the current

    }
}
