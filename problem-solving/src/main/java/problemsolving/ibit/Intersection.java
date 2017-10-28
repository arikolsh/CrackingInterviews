package problemsolving.ibit;

import java.util.ArrayList;

/**
 * Created by ariko on 10/28/2017.
 */
public class Intersection {
    public ArrayList<Integer> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        Integer aNum, bNum;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < a.size() && j < b.size()) {
            aNum = a.get(i);
            bNum = b.get(j);
            if (aNum.equals(bNum)) {
                res.add(aNum);
                i++;
                j++;
            } else if (aNum > bNum) {
                j++;
            } else {
                i++;
            }
        }
        return res;

    }
}
