package problemsolving.ibit;

import java.util.ArrayList;

/**
 * Created by ariko on 10/28/2017.
 */
public class removeDup {
    public int solve(ArrayList<Integer> a) {
        if((a==null) || (a.size()==0)){
            return 0;
        }
        int lo=0, hi=0;
        while(hi<a.size()){
            a.set(lo, a.get(hi));
            while(hi<a.size() && a.get(hi).equals(a.get(lo))){
                hi+=1;
            }
            lo+=1;
        }

        System.out.println(a.subList(0,lo));
        return lo;
    }
}
