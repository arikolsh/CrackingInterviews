package problemsolving.misc;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by ariko on 12/2/2017.
 */
public class PrintAllUniqueDigits {

    public List<Integer> solve(int s, int e) {

        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = s; i <= e; i++) {
            digits.clear();
            getDigits(i, digits);
            if (allDigitsUnique(digits)) {
                res.add(i);
            }
        }

        return res;
    }

    private boolean allDigitsUnique(ArrayList<Integer> digits) { //digit is always in [0,9]
        int[] digCount = new int[10];
        for (Integer digit : digits) {
            if (digCount[digit] >= 1) {
                return false;
            }
            digCount[digit]++;
        }
        return true;
    }

    private void getDigits(int i, ArrayList<Integer> digits) {
        while (i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
    }
}
